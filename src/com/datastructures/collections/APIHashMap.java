package com.datastructures.collections;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class APIHashMap {
    public static void main(String [] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hussein");
        map.put(2, "Mohamed");
        map.put(3, "Andorino");
        map.put(4, "Pirlo");

        System.out.println(map.get(1));

        for (Map.Entry m : map.entrySet()){
            System.out.println(" key: " + m.getKey() + " value: " + m.getValue());
        }

        map.put (1, "Hussein Mohamed"); // updates element with key 1 with the new string.
        map.remove(3); // remove

    }
}
