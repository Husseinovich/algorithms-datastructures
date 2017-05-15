package com.datastructures.queue;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class QueueDynamicArray<T> {
    Object [] arrayQueue;
    int rear;
    int front;
    int size;

    public QueueDynamicArray(int size){
        this.size = size;
        arrayQueue = new Object[this.size];
        front = -1;
        rear = -1;
    }
    public boolean isFull(){
        return rear == size - 1;
    }

    public boolean isEmpty(){
        return front == size - 1 || front > rear;
    }
    public void queue(Object newItem){
       ensureCapacity(rear + 2);
        rear ++;
        arrayQueue[rear] = newItem;
        if ( front == -1){
            front = 0;
        }

    }

    public void ensureCapacity(int minCapacity){
        int oldCapacity = getSize();
        if(minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity)
                newCapacity = minCapacity;
            arrayQueue = Arrays.copyOf(arrayQueue, newCapacity);
        }
    }

    public int getSize(){
        return arrayQueue.length;

    }
    public T deque(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        T element = (T) arrayQueue[front];
        front = front ++;
        return element;

    }
}
