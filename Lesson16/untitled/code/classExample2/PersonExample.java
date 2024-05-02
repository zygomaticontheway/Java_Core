package classExample2;

public class PersonExample {
    public static void main(String[] args) {
//        Person person1 = new Person(); //то же самое, что ниже, но короче записано

        Person person1;
        person1 = new Person();

        person1.name = "Ruslan";
        person1.age = 32;
        person1.isAdult = true;

//        System.out.println("Hello! My name is " + person1.name);
//        System.out.println("My age is " + person1.age);
        person1.greeting();

        Person person2 = new Person();
        person2.name = "Ludmila";
        person2.age = 18;
        person2.isAdult = true;

//        System.out.println("Hello! My name is " + person2.name);
//        System.out.println("My age is " + person2.age);

        person2.greeting();
    }
}
