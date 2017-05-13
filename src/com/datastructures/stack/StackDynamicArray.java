package com.datastructures.stack;

import java.util.Arrays;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackDynamicArray <T>{
    Object [] arrayStack;
    int size;
    int top;

    public StackDynamicArray(int size){
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }
    public int getSize(){
        return arrayStack.length;
    }


    public void ensureCapacity(int minCapacity){
        int oldCapacity = getSize();
        if(minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity)
                newCapacity = minCapacity;
            arrayStack = Arrays.copyOf(arrayStack, newCapacity);
        }
    }
    public void push(Object newItem){
       ensureCapacity(top+2);
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
