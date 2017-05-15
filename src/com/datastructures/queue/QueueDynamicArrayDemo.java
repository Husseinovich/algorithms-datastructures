package com.datastructures.queue;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class QueueDynamicArrayDemo {
    public static void main (String [] args){
        QueueDynamicArray <Integer> queueArray = new QueueDynamicArray<>(2);
        queueArray.queue(11);
        queueArray.queue(12);

        System.out.println("Deque  = " +  queueArray.getSize());

        queueArray.queue(14);

        System.out.println("Deque  = " +  queueArray.getSize());





    }
}
