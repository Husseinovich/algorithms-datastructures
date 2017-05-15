package com.datastructures.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(2);
        q.add(34);
        q.add(14);
        q.add(50);

        System.out.println(q);
        System.out.println(q.poll()); // FIFO the first element that was added

        System.out.println(" Prioroty Queue"); // when element is popped, the least element will be popped.

        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(q);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll()); // pops out 2 because it finds th element with least priority (less) and pops out
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);


    }
}