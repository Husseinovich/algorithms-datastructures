package com.datastructures.stack;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackDynamicArrayDemo {
    public static void main(String [] args){
        StackDynamicArray<Integer> stack = new StackDynamicArray<>(2);

        stack.push(10);
        stack.push(12);
        System.out.println("size = " + stack.getSize());
        stack.push(13);
        System.out.println("size = " + stack.getSize());

        stack.push(14);
        System.out.println("size = " + stack.getSize());

        stack.push(15);
        System.out.println("size = " + stack.getSize());


        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop());

    }
}
