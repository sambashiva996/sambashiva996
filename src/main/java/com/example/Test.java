package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("good", "morning");

        char[] charArray = list.stream().collect(Collectors.joining()).toCharArray();

        System.out.println(Arrays.toString(charArray));
//        list.stream().map(s -> s.split("")).map(Arrays::stream).collect(Collectors.toList());


    }

}
