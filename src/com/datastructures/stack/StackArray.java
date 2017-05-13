package com.datastructures.stack;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackArray <T>{
    Object [] arrayStack;
    int size;
    int top;

    public StackArray(int size){
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }
    public void push(Object newItem){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top ++;
        arrayStack[top] = newItem;
    }
    public boolean isFull(){
        return  ( top == size - 1);
    }
    public boolean isEmpty(){
        return (top ==  - 1);
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        T item = (T) arrayStack[top];
        top--;
        return item;
    }

}
