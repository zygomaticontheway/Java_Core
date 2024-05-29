package code.differentCollections;

import java.util.HashMap;

import java.util.Map;

public class RandomAccessMap {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.put(i,i);
        }

        // время доступа к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            int randomKey = (int) (Math.random() * numbers.size());
            int element = numbers.get(randomKey);
           // System.out.println("Значение элемента с индексом " + randomIndex + " : " + element);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
}
