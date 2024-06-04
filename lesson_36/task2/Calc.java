package task2;

public class Calc <T extends Number>{
    T number1;
    T number2;

    public Calc() {
        this.number1 = number1;
        this.number2 = number2;
    }



    public T getNumber1() {
        return number1;
    }

    public T getNumber2() {
        return number2;
    }
    public <U> void sum (T number1, T number2){
        System.out.println(number1 + " + " + number2 + " = " + (number1.doubleValue() + number2.doubleValue()));
    }
    public <U> void minus (T number1, T number2){
        System.out.println(number1 + " - " + number2 + " = " + (number1.doubleValue() - number2.doubleValue()));
    }
    public <U> void mul (T number1, T number2){
        System.out.println(number1 + " * " + number2 + " = " + (number1.doubleValue() * number2.doubleValue()));
    }
    public <U> void devide (T number1, T number2){
        System.out.println(number1 + " / " + number2 + " = " + (number1.doubleValue() / number2.doubleValue()));
    }

    @Override
    public String toString() {
        return "Calc{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
