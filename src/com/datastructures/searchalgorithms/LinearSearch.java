package com.datastructures.searchalgorithms;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class LinearSearch {

    public static void main(String [] args){
        DataSet data = new DataSet(1000000);
        int search = 999999;
        boolean isFound = false;

        for (int i = 0; i < data.getSize(); i++){
            data.numOfTries ++;
            if (data.data[i] == search){
                System.out.println("Element is found after " + data.numOfTries + " tries");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    }
}
