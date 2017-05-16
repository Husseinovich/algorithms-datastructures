package com.datastructures.sortingalgorithms;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class BubbleSort {
    public static void main (String[] args){

        int [] data = { 1, 50, 40, 2, 10, 30, 42};
        System.out.println("Array before");
        System.out.println(Arrays.toString( data));

        System.out.println("Array after");
        bubblesort(data);
        System.out.println(Arrays.toString( data));


    }

    public static void bubblesort(int a[]){
        int n = a.length;
        int temp;
        for (int i = 0 ; i < n; i++){
            for (int j = 1; j < n-i; j++){
                if (a [j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
