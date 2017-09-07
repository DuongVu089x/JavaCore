package com.dav.javacore.oop.abstractdemo;

public class Test {

    public static void main(String[] args) {

        AnimalAbstract dog = new Dog();
        dog.setName("Milu");
        dog.setColor("#000");
        dog.setSpecies("DOG");
        dog.talk();
        System.out.println("Can fly: "+ ((Dog) dog).canFly());

        AnimalAbstract cat = new Cat();
        cat.setName("Money");
        cat.setColor("#fff");
        cat.setSpecies("CAT");
        cat.talk();
        System.out.println("Can fly: "+ ((Cat) cat).canFly());

        Bird bird = new Bird();
        bird.setName("Honney");
        bird.setColor("#hsl(0, 100%, 50%)");
        bird.setSpecies("CAT");
        bird.talk();
        System.out.println("Can fly: "+ bird.canFly());
    }
}
