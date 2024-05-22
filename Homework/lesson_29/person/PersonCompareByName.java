package lesson_29.person;

import java.util.Comparator;

public class PersonCompareByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int compareResult = person1.getName().compareToIgnoreCase(person2.getName());
        return compareResult;
    }
}
