package lesson_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ConcatLists {
    public static void main(String[] args) {

//        6. Напишите функциональный интерфейс для объединения двух списков в один

        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("d","e","f"));

        BinaryOperator<ArrayList<String>> binaryOperator = (x, y) -> {
            ArrayList<String> concated = new ArrayList<>(x);
            concated.addAll(y);
            return concated;
        };
        ArrayList<String> mergedArray = concatArrays(list1, list2, binaryOperator);
        System.out.println(mergedArray);
    }
    public static ArrayList<String> concatArrays (List<String> l1, List<String> l2, BinaryOperator binaryOperator){
       return (ArrayList<String>) binaryOperator.apply(l1, l2);
    }
}
