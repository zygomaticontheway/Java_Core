package code.practice;

import Lesson18hw.company.UserInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    /*
    создайте коллекцию которая будет содержать 30 случайных чисел

    напишите метод, который удаляет из этой коллекции все числа, которые больше заданного значения

    при решении задачи НЕ ИСПОЛЬЗОВАТЬ СОЗДАНИЕ НОВОЙ КОЛЛЕКЦИИ

     */
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 29; i++) {
            Integer randomNumber = (int) (Math.random() * 100);
            randomNumbers.add(randomNumber);
        }
        System.out.println("Рандомная коллекция" + randomNumbers);

        UserInput ui = new UserInput();

        int numberForCompare = ui.inputInt("Введите число, больше которого элементы будут удалены:");

        Iterator<Integer> numbersIterator = randomNumbers.iterator();

        while (numbersIterator.hasNext()) {
            Integer number = numbersIterator.next();

            if (number > (numberForCompare)){
                numbersIterator.remove();
            }
        }
        System.out.println('\n' + "Отутюженная коллекция" + randomNumbers);
    }
}
