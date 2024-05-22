package lesson_29.person;

import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Tom","York"));
        personList.add(new Person("Nick","Wiseman"));
        personList.add(new Person("James","Bond"));
        personList.add(new Person("Bill","Kill"));
        personList.add(new Person("Alice","In Wonderland"));

        Comparator<Person> comparatorByName = new PersonCompareByName();

        Set<Person> peopleSortedByName = new TreeSet<>(comparatorByName);

        peopleSortedByName.addAll(personList);
        for (Person person: peopleSortedByName) {
            System.out.print(person.getName() + " " + person.getSureName() + " | ");
        }


        Comparator<Person> comparatorBySureName = new PersonCompareBySureName();

        Set<Person> peopleSortedBySureName = new TreeSet<>(comparatorBySureName);

        peopleSortedBySureName.addAll(personList);
        System.out.println();
        for (Person person: peopleSortedBySureName) {
            System.out.print(person.getName() + " " + person.getSureName() + " | ");
        }
    }
}
