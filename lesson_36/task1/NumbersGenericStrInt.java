public class NumbersGenericStrInt <T, U>{
    T item1;
    U item2;

    public NumbersGenericStrInt(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public U getItem2() {
        return item2;
    }
}
