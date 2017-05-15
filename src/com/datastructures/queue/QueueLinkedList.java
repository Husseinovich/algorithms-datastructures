package com.datastructures.queue;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class QueueLinkedList <T> {
    private NodeD rear;
    private NodeD front;

    public QueueLinkedList() {
        rear = null;
        front = null;
    }

    public void queue(Object value) {
        NodeD newNode = new NodeD(value, null, null);
        if (rear == null) {
            rear = newNode;
            front = newNode;
        } else {
            newNode.next = null;
            newNode.prev = rear;
            rear.next = newNode;
        }
    }

    public T deque() {
        if (rear == null || front == null){
            System.out.println("Queue is empty");
            return null;

        }
        T value = (T) front.value;
        front = front.next;
        if (front!= null){
            front.prev = null;
            return value;
        }
    return value;
    }
}
