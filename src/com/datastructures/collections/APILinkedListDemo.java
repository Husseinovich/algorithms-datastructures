package com.datastructures.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class APILinkedListDemo {

    public static void main(String [] args){
        /**
         * Used Linked list when doing a lot of adding and deleting operations
         * Not good for reading data frequently
         */
        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("Hussein");
        linkedList.add("Moham");
        linkedList.add("Abdi");
        linkedList.add("yuyu");

        Iterator <String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
