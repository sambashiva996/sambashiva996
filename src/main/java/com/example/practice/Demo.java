package com.example.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

                int a = 2;
                int b = 2;

                if ((a == 1) & (b++ == 2)) {  // b is incremented regardless
                    System.out.println("Using & : Condition met");
                }
                System.out.println("b after & : " + b); // Output: 3

                b = 2; // Reset b

                if ((a == 1) && (b++ == 2)) {  // b is incremented only if first condition is true
                    System.out.println("Using && : Condition met");
                }
                System.out.println("b after && : " + b); // Output: 3
    }
}
