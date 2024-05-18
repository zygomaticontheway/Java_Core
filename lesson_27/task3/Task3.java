package code.practice.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {


    /*
    создайте коллекцию для хранения перевода слов
    ключом должно являться английское слово,
    а значением - перевод

    задайте 5 слов с переводом

    выведите словарь на экран
     */
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("run", "бегать");
        dictionary.put("seat", "сидеть");
        dictionary.put("jump", "прыгать");
        dictionary.put("throw", "бросать");
        dictionary.put("fly", "летать");

        System.out.println(dictionary);

        for (int i = 0; i < dictionary.size(); i++) {
            List<String> keys = new ArrayList<String>(dictionary.keySet());
            System.out.println(keys.get(i) + " = " + dictionary.get(keys.get(i)));
        }
    }
}
