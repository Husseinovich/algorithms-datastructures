package com.datastructures.stack;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackLinkedList<T>{
    private Node top;
    public StackLinkedList() {
        top = null;
    }
    public void push(Object value){
        Node newNode = new Node(value, null);
        if (top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop(){
        if (top == null){
            System.out.println("Stack is empty");
            return null;
        }
        T value = (T) top.value;
        top = top.next;
        return value;
    }


}
