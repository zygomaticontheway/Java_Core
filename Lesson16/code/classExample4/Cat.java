package classExample4;

public class Cat {
    String name;
    int age;
    boolean isHungry;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void meow(){
        System.out.println("Cat: " + name + " says: \"meowwww\"" + " that is " + isHungry + ", it is Hungry");
    }

}
