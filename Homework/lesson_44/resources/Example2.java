package lesson_44.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       Map<Boolean, List<Integer>> groupByEvenOdd =
               integers.stream()
                       .collect(Collectors.groupingBy(x -> x % 2 == 0));

        System.out.println(groupByEvenOdd);

    }

}
