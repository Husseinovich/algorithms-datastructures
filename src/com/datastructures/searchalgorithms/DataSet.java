package com.datastructures.searchalgorithms;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class DataSet {

    int [] data;
    int  numOfTries;

    public DataSet(int size){
        data = new int [size];
        for (int i = 1; i <= getSize(); i++){
            data[i-1] = i;
        }
        numOfTries = 0;
    }
    public int getSize(){
        return  data.length;
    }
}
