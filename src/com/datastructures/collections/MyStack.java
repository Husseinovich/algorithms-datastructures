package com.datastructures.collections;
import java.util.Stack;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class MyStack {
    public static void main(String [] args){
        Stack<String> stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.pop()); // LIFO - removes element that was pushed last - in this case D
        System.out.println(stack.peek()); // checks out the last element like pop but doesnt remove it.

    }
}
