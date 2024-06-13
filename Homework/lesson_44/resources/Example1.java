package lesson_44.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("0123", "01234","12345","1234","23456");

        Map<Integer, List<String>> wordByLength = words.stream()
                .collect(Collectors.groupingBy(word -> word.length()));

        System.out.println(wordByLength);

    }

}
