package com.datastructures.LinkedLists;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListU<Integer> linkedList = new LinkedListU<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		System.out.println("Before delete");
		linkedList.display();
		
		System.out.println("after delete");

		linkedList.delete();
		linkedList.display();

	}

}
