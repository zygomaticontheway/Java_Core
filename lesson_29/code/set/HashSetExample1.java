package lesson_29.code.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(7);
        integers.add(8);
        integers.add(1);
        integers.add(5);

        System.out.println(integers);



    }
}
