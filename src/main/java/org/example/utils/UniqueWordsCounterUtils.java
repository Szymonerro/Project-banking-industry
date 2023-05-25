package org.example.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class UniqueWordsCounterUtils {

    public static void countUniqueWords(File inputFile, File outputFile) throws IOException {

        FileUtils.touch(inputFile);

        List<String> lines = new ArrayList<>();
        List<?> rawLines = FileUtils.readLines(inputFile, "UTF-8");
        for (Object line : rawLines) {
            lines.add((String) line);
        }

        Set<String> words = new HashSet<>();
        for (String line : lines) {
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.add(StringUtils.strip(word, ".,:;\"'()[]{}!?-"));
            }
        }

        int uniqueWordsCount = words.size();
        String outputString = "Number of unique words: " + uniqueWordsCount;
        FileUtils.writeStringToFile(outputFile, outputString, "UTF-8");
    }
}
