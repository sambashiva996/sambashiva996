package com.example.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Programs {

    public static void main(String[] args) {

        /*Java 8*/
        /* print  characters and count of character from given string*/
        String s = "Samba shivudu ambati";

        Map<String, Long> charAndCountOfChars = Arrays.stream(s.split("")).map(sChar -> sChar.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charAndCountOfChars);

        /*print first non repeat character from given string*/

        String s1 = "samba shivudu ambati";

        Optional<String> firstNonRepeatChar = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(c -> c.getValue() == 1).map(m -> m.getKey()).findFirst();

        System.out.println(firstNonRepeatChar.get());

        /*slice the array with custom start and last index from
        *given input and in the output new sliced array based on indexes
        * */
        int startIndex = 4;
        int lastIndex = 8;

        int[] originalIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] slicedResult = Arrays.copyOfRange(originalIntArray, startIndex, lastIndex);
        /*OR*/
        int[] array = IntStream.range(startIndex, lastIndex).map(index -> originalIntArray[index]).toArray();
        System.out.println(Arrays.toString(slicedResult));

    }
}
