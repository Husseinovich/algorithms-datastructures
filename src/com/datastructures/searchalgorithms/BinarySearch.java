package com.datastructures.searchalgorithms;

import javax.xml.crypto.Data;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class BinarySearch {

    public static void main (String [] args){
        DataSet data = new DataSet(1000000);
        int key = 10000000;

        System.out.println(binarySearch(data.data, key));


    }

    public static int binarySearch(int [] a, int key){
        int numOfTries = 0;
        int low = 0;
        int high = a.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            numOfTries ++;
            if (key < a[mid])
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
            else{
                System.out.println(" Element found after " + numOfTries + " tries");
                return mid;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }
}
