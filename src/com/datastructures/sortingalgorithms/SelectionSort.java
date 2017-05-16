package com.datastructures.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] data = {1, 50, 40, 2, 10, 30, 42};
        System.out.println("Array before");
        System.out.println(Arrays.toString(data));

        System.out.println("Array after");
        selectSort(data);
        System.out.println(Arrays.toString(data));


    }

    public static void selectSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++){
            int index = i;
            for (int j = i+1; j< a.length; j++){
                if( a[j] < a[index]){
                    index  = j;
                }
            }
            if (index != i){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }

        }
    }
}
