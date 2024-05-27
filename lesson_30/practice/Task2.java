import java.util.*;

public class Task2 {
    /*
    Дана коллекция string

    написать метод, который в  коллекции заменяет все элементы,
    которые содержат букву 'a' на "..."

     */
    public static void main(String[] args) {
        List<String> phrase = new ArrayList<>();

        phrase.add("Каждый");
        phrase.add("охотник");
        phrase.add("желает");
        phrase.add("знать");
        phrase.add("где");
        phrase.add("сидит");
        phrase.add("фазан");

        System.out.println("Наша коллекция" + phrase);

        public static void replaceString(List<String> ourList, String checkContain, String replaceElement){
            ListIterator<String> listIterator = ourList.listIterator();

            while (listIterator.hasNext()){
                String currentString = listIterator.next();

                if (currentString.contains(checkContain)){
                    listIterator.set(replaceElement);
                }
            }

        }
        System.out.println('\n' + "Отутюженная коллекция" + phrase);

    }
}
