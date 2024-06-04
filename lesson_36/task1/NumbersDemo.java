import java.util.ArrayList;
import java.util.List;

public class NumbersDemo {
    public static void main(String[] args) {
        NumbersGenericStrInt <String, Integer> numbersGenericStrStr = new NumbersGenericStrInt<>("90", 90);
        NumbersGenericStrInt <Double, String> numbersGenericDoubleStr = new NumbersGenericStrInt<>(90.9, "90");
        NumbersGenericStrInt <Double, List<String>> numbersGenericCollection = new NumbersGenericStrInt<>(90.9, new ArrayList<>());
        numbersGenericCollection.getItem2().add("I'm the second parameter in collection");

        System.out.println(numbersGenericDoubleStr.item1 + " : " + numbersGenericDoubleStr.item2);
        System.out.println(numbersGenericStrStr.item1 + " : " + numbersGenericStrStr.item2);
        System.out.println(numbersGenericCollection.item1 + " : " + numbersGenericCollection.item2.get(0));
    }
}
