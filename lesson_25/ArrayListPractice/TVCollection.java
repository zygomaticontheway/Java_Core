import java.util.ArrayList;

public class TVCollection {
    public static void main(String[] args) {
//        TV tv1 = new TV("LG", 42);
//        TV tv2 = new TV("Samsung", 52);
//        TV tv3 = new TV("LG", 42);

        ArrayList<TV> TVs = new ArrayList<>();
        System.out.println(TVs);

        TVs.add(new TV("LG", 42));
        TVs.add(new TV("Samsung", 52));
        TVs.add(new TV("LG", 82));

        System.out.println(TVs);

        for (int i = 0; i < TVs.size() -1; i++) {
            if (TVs.get(i).getManufacturer().equals("LG")) {
                TVs.remove(TVs.get(i));
                break;
            }

        }
        System.out.println(TVs);
    }
}
/*
создать класс TV
- производитель
- размер

создать коллекцию
добавить 3 элемента
распечатать коллекцию
удалить один элемент - первый из всех у кого совпадает производитель

 */