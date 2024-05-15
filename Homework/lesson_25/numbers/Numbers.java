package lesson_25.numbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        int randomAmount = (int)(Math.random() * (100) +5);
        System.out.println("The length of ArrayList NUMBERS is " + randomAmount);

        for (int i = 0; i < randomAmount; i++) {
            Integer randomNumber = (int)(Math.random() * (100) +1);
            numbers.add(i, randomNumber);
        }
        System.out.println(numbers);

        //Максимальный элемент с помощью цикла
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println("Max element is: " + max);

        //Минимальный элемент с помощью Colelctions.min
        System.out.println("Min element is: " + Collections.min(numbers));

    }
}
