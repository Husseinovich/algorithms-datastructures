package com.datastructures.queue;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class QueueLinkedListDemo {
public static void main(String [] args){
    QueueLinkedList <String> q = new QueueLinkedList<>();

    q.queue("Hussein");
    q.queue("Hassan");
    q.queue("Fatuma");
    q.queue("Yuyu");


    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());

}
}