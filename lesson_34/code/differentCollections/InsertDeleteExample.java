package code.differentCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertDeleteExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // время доступа к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300_000; i++) {
            int randomIndex = (int) (Math.random() * numbers.size());
            numbers.add(randomIndex,i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();

        while (!numbers.isEmpty()){
            int randomIndex = (int) (Math.random() * numbers.size());
            numbers.remove(randomIndex);
        }
        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


    }
}
