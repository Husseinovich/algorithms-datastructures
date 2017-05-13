package com.datastructures.queue;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class QueueArrayDemo {
    public static void main (String [] args){
        QueueArray <Integer> queueArray = new QueueArray<>(5);
        queueArray.queue(5);
        queueArray.queue(2);
        queueArray.queue(3);
        queueArray.queue(6);

        System.out.println("Deque  = " +  queueArray.deque());


    }
}
