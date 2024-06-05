public class LambdaExample2 {
    /*
реализуйте код с использованием лямбда-выражения, который
определяет количество вхождений (количество повторов) элемента в массив

Реализовать метод класса, который получает массив, элемент для поиска и
лямбда-выражение в качестве параметров и возвращает количество вхождений
     */

    public static void main(String[] args) {

        int[] array = {5,3,8,10,2,1,2,3,2,2,2,3,4,5};

        IFindItem ref = (int item, int[] workingArray) -> {
            int count =0;
            for (int i = 0; i < workingArray.length; i++) {
                if(item == workingArray[i]){
                    count++;
                }
            }
            return count;
        };

        System.out.println("количество вхождений = " + findItem(array, 2, ref));
    }

    public static int findItem(int[] array, int item, IFindItem ref){
        int count = ref.countOccurrences(item, array);
        return count;

    }
}
