package com.datastructures.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class APIHashSets {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("G");
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("C");

//        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for(String temp : hashSet){
            System.out.println(temp);
        }
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Zahra");
        treeSet.add("H&M");
        treeSet.add("Topman");
        treeSet.add("Barista");

        System.out.println(hashSet);

    }

}