package com.datastructures.Hashtable;

import java.util.HashMap;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable<String> hashmap = new HashTable<String>(10);
		
		hashmap.put(1, "Hussein");
		hashmap.put(2, "Hassan");
		hashmap.put(3, "Mohamed");
		
		System.out.println(hashmap.get(1));
		
		
		// Java API hashMap
		
		HashMap<Integer, String> hash = new HashMap<>();
		
		hash.put(1, "Hussein");
		hash.put(2, "Hassan");
		hash.put(3, "Mohamed");
		
		
		System.out.println(hash.get(1));

		

	}

}
