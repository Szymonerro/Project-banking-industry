package org.example.utils;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    private final int[] arrayToSort;
    private final int n;
    private int counter = 0;
    private boolean swapped = true;

    public BubbleSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many numbers do you want to sort?");
        n = scanner.nextInt();
        arrayToSort = new int[n];
        System.out.println("Enter the numbers to sort, separated by spaces:");
        for (int i = 0; i < n; i++) {
            arrayToSort[i] = scanner.nextInt();
        }
        bubbleSort();
    }

    public void bubbleSort() {
        while (counter < n - 1 && swapped) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swap(arrayToSort, j, j + 1);
                    swapped = true;
                }
            }
            counter++;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public String toString() {
        return "Sorted array: " + Arrays.toString(arrayToSort);
    }
}
