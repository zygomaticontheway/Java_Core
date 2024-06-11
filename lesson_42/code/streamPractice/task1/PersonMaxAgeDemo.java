package code.streamPractice.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonMaxAgeDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Petr",29);
        Person person2 = new Person("Ruslan",32);
        Person person3 = new Person("Victor",28);
        Person person4 = new Person("Mike",48);
        Person person5 = new Person("Vadim",38);


        // найти максимальный возраст

        List<Person> user = Arrays.asList(person1,person2,person3,person4,person5);


        Person userWirthMaxAge = user.stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person p1, Person p2) {
                        return Integer.compare(p2.getAge(), p1.getAge());
                    }
                })
                .findFirst()
                .orElse(null);

// альтернативная форма записи ( делает ТОЖЕ САМОЕ но пишется короче)

        userWirthMaxAge = user.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()))
                .findFirst()
                .orElse(null);

        userWirthMaxAge = user.stream()
                .sorted(Comparator.comparingInt((Person p) -> p.getAge()).reversed())
                .findFirst()
                .orElse(null);

// альтернативная форма записи ( делает ТОЖЕ САМОЕ но пишется короче)
        userWirthMaxAge = user.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .findFirst()
                .orElse(null);


        System.out.println(userWirthMaxAge);


        userWirthMaxAge = user.stream()
                .reduce((p1,p2) -> Person.maxAge(p1,p2))
                .get();

        // альтернативная форма записи ( делает ТОЖЕ САМОЕ но пишется короче)

        userWirthMaxAge = user.stream()
                .reduce(Person::maxAge)
                .get();

        System.out.println(userWirthMaxAge);



    }
}
