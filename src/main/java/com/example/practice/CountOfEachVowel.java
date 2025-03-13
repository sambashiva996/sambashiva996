package com.example.practice;

import java.util.*;

public class CountOfEachVowel {
    public static void main(String[] args) {
        String s = "sambashivuduambati";
        Map<Character, Integer> map = new HashMap<>();
        List<Character> strings = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (strings.contains(charAt)) {
                if (map.containsKey(charAt)) {
                    Integer count = map.get(charAt);
                    map.put(charAt, ++count);
                } else {
                    map.put(charAt, 1);
                }
            }
        }
        System.out.print(map);
    }
}
