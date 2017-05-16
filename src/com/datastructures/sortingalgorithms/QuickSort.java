package com.datastructures.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] data = {1, 50, 40, 2, 10, 30, 42, 100, 34, 56,34,6, 23,26,13,45 ,75};
        System.out.println("Array before");
        System.out.println(Arrays.toString(data));
        int low = 0;
        int high = data.length - 1;
        System.out.println("Array after");
        quickSort(data, low, high);
        System.out.println(Arrays.toString(data));


    }


    /**
     * Select a pivot, normally the middle one
     From both ends, swap elements and make left elements < pivot and all right > pivot
     Recursively sort left part and right part

     * @param a
     * @param low
     * @param high
     */
    public static void quickSort(int a[], int low, int high) {
        if (low > high) return;
        int mid = low  + (high - low) / 2;
        int pivot = a[mid];
        int i = low;
        int j = high;

        while (i <= j){
            while( a[i] < pivot)
                i++;
            while(a[j] > pivot)
                j--;
            if (i <=j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(a, low,j);

        if (high > i)
            quickSort(a, i, high);

    }
}
