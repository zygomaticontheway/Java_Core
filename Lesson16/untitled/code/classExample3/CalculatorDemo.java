package classExample3;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum();
        calc.sum1(2, 3);

        calc.sum2(1, 2);

        int resultSum3 = calc.sum2(5, 6);
        System.out.println("Результат работы метода:" + resultSum3);



    }
}
