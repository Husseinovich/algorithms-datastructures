package com.datastructures.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Husseinovich on 5/15/17.
 */
public class FirstDupCharacter {
    public static void main(String[] args) {
        System.out.println(findDupCharacter("abbcdefghiaklmno"));
    }

    private static Character findDupCharacter(final String input) {
        final Set set = new HashSet();
        Character dup = null;
        for (int i = 0; i < input.length(); i++) {
            if (set.contains(input.charAt(i))) {
                dup = input.charAt(i);
                break;
            } else {
                set.add(input.charAt(i));
            }
        }
        return dup;
    }
}
