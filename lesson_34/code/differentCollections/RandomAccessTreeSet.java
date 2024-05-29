package code.differentCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RandomAccessTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < 1_000_000; i++) {
            int randomElement = (int) (Math.random() * 1_000_000);
            numbers.add(randomElement);
        }

        System.out.println("Размер коллекции = " + numbers.size());

        // время доступа к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            int randomElement = (int) (Math.random() * numbers.size());
            numbers.contains(randomElement);
           // System.out.println("Значение элемента с индексом " + randomIndex + " : " + element);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        System.out.println("Размер коллекции = " + numbers.size());

    }
}
