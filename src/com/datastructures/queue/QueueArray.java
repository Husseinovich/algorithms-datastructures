package com.datastructures.queue;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class QueueArray <T> {
    Object [] arrayQueue;
    int rear;
    int front;
    int size;

    public QueueArray(int size){
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
        if (isFull()){
            System.out.println("Queue is full!");
            return;
        }
        rear ++;
        arrayQueue[rear] = newItem;
        if ( front == -1){
            front = 0;
        }

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
