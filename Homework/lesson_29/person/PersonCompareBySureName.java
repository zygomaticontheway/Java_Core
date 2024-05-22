package lesson_29.person;

import java.util.Comparator;

public class PersonCompareBySureName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int compareResult = person1.getSureName().compareToIgnoreCase(person2.getSureName());
        return compareResult;
    }
}
