package lesson_29.code.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Four");
        strings.add("Ten");
        strings.add("One");
        strings.add("Ten");
        strings.add("Four");


        System.out.println(strings);



    }
}
