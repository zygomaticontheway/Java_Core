package lesson_42.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsSortTask1 {
    /*
    Задача 1: Фильтрация и сортировка коллекции

Задание: Дан список строк.
Необходимо отфильтровать из этого списка все строки,
которые начинаются на букву "A" (без учёта регистра), и
вернуть список этих строк, отсортированный в алфавитном порядке.
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Alabama", "Bambino", "Milk", "Small", "Alice","Aluminium");

        List<String> filteredStrings = strings.stream()
                .map(string -> string.toLowerCase())
                .filter(string -> string.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredStrings);

    }
}
