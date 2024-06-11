package code.streamPractice.task1;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static Person maxAge(Person person1, Person person2){
        return person1.getAge() > person2.getAge() ? person1 : person2;
    }

    /*
    1 вариант - описать правила сортировки через Comparator прямо в методе sorted()

    2 вариант - описать правила сортировки уже в классе Person и использовать sorted() в 'естественном порядке'

    3 вариант - создать отдельный метод для сортировки


     */
}
