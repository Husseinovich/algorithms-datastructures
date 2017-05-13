package com.datastructures.stack;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackLinkedListDemo {
    public static void main(String [] args){
        StackLinkedList<String> stack = new StackLinkedList<String>();

       stack.pop();
       stack.push("Hussein");
       stack.push("Hassan");
       stack.push("Polima");

       System.out.println(stack.pop());
    }
}
