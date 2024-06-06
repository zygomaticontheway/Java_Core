package lesson_39;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class OperationsWithNumbers {
    public static void main(String[] args) {

//        2. Напишите функциональный интерфейс для вычисления суммы двух целых чисел.

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println("Sum in task 2 = " + calc(4, 5, sum));

//        4. Напишите функциональный интерфейс для вычисления факториала числа.

        UnaryOperator<Integer> factorial = (n) -> {
            int result = 1;
            if (n > 0) {
                for (int i = 2; i <= n; i++) {
                    result = result * i;
                }
                return result;
            }
            return -1;
        };

        System.out.println("Factorial in task 4 = " + factorialMethod(4, factorial));

//        5. Напишите функциональный интерфейс для проверки, является ли число простым.

        Predicate<Integer> isSimpleNumber = m -> {
            if (m <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println("The number is simple: " + isSimpleCheck (223, isSimpleNumber));

    }
    public static Integer calc (Integer x, Integer y, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(x, y);
    }
    public static Integer factorialMethod (Integer x, UnaryOperator<Integer> unaryOperator){
        return unaryOperator.apply(x);
    }
    public static boolean isSimpleCheck (Integer m, Predicate<Integer> predicate){
        return predicate.test(m);
    }
}
