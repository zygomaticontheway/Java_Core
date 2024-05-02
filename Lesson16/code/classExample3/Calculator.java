package classExample3;

public class Calculator {
    public void sum(){
        int x = 10;
        int y = 15;
        int result = x + y;
        System.out.println("Результат:" + result);
    }
    public void sum1(int x, int y){
        int result = x + y;
    }
    public int sum2(int x, int y){
        int result = x + y;
        return result;
    }
}
