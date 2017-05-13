package com.datastructures.stack;

/**
 * Created by Husseinovich on 5/13/17.
 */
public class StackArrayDemo {
    public static void main(String [] args){
        StackArray<Integer> stack = new StackArray<>(5);

        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop());

    }
}
