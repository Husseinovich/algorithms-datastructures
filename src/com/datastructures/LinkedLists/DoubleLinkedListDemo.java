package com.datastructures.LinkedLists;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();
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
