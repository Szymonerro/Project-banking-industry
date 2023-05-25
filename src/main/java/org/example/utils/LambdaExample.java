package org.example.utils;

import java.util.function.*;
import java.util.List;

public class LambdaExample {
    // 1. Predicate - check if number is positive
    public static Predicate<Integer> isPositive = n -> n > 0;

    // 2. Function - return length of text
    public static Function<String, Integer> stringLength = String::length;

    // 3. Consumer - shows text on screen
    public static Consumer<String> printString = System.out::println;

    // 4. Supplier - return random number
    public static Supplier<Integer> randomInt = () -> (int) (Math.random() * 100);

    // 5. UnaryOperator - return square of the number
    public static UnaryOperator<Integer> square = n -> n * n;


    // 6. Function that returns the first element of a list
    public static <T> Function<List<T>, T> getFirstElement() {
        return list -> list.get(0);
    }

    // 7. Function that returns the average of a list of numbers
    public static <T extends Number> Function<List<T>, Double> getAverage() {
        return list -> list.stream()
                .mapToDouble(Number::doubleValue)
                .average()
                .orElse(Double.NaN);
    }

    // 8. Function that returns the concatenation of two strings
    public static BiFunction<String, String, String> concatenateStrings = (str1, str2) -> str1 + str2;
}
