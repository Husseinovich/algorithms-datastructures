package com.datastructures.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class MyPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue <Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Student("Hussein", 23));
        priorityQueue.add(new Student("Pirlo", 42));
        priorityQueue.add(new Student("MOhamed", 12));

        System.out.println(priorityQueue.poll().age); // pops out 12 after we implemented comparable




    }
}