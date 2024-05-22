package lesson_29.person;

import java.util.Objects;

public class Person {
    String name;
    String sureName;

    public Person(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(sureName, person.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName);
    }
}
