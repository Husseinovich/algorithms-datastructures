package com.datastructures.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class MergeSort {

    public static int[] numbers;
    private static int[] helper;

    private static int number;

    public static void sort(int[] values) {
        numbers = values;
        number = values.length;
        helper = new int[number];
        mergesort(0, number - 1);
    }

    public static void main(String[] args) {



        int[] data = {1, 50, 40, 2, 10, 30, 42, 72,4,3,9,5,9,4,8,0,89,44,64,234};
        System.out.println("Array before");
        System.out.println(Arrays.toString(data));

        System.out.println("Array after");
        sort(data);

        System.out.println(Arrays.toString(data));

        Arrays.sort(data);


    }

    private static void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }
    private static void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
