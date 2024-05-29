package code.differentCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RandomAccess {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        // время доступа к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            int randomIndex = (int) (Math.random() * numbers.size());
            int element = numbers.get(randomIndex);
           // System.out.println("Значение элемента с индексом " + randomIndex + " : " + element);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
}
