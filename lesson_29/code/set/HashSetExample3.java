package lesson_29.code.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Four");
        strings.add("Ten");
        strings.add("One");
        strings.add("Ten");
        strings.add("Four");


        System.out.println(strings);

        //Выбрать из коллекции уникальные элементы
        List<String> uniqueStrings = new ArrayList<>();
        for (String currentElement : strings) {

            if (!uniqueStrings.contains(currentElement)){
                uniqueStrings.add(currentElement);
            }
        }
        System.out.println(uniqueStrings);

        //То же самое но с HashSet
        Set<String> setUniqueElement = new HashSet<>(strings);
        System.out.println(uniqueStrings);




    }
}
