package modifciators;

import modifciators.entity.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Murzik";
        System.out.println(cat);

        Parrot parrot = new Parrot();
        System.out.println(parrot.getName());
    }


}
