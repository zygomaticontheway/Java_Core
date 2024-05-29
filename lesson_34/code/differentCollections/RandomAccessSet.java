package code.differentCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RandomAccessSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        // время доступа к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            int randomElement = (int) (Math.random() * numbers.size());
            numbers.contains(randomElement);
           // System.out.println("Значение элемента с индексом " + randomIndex + " : " + element);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
}
