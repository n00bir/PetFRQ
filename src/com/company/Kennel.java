package com.company;

public class Kennel {
    private Pet[] kennel = new Pet[3];

    public Kennel(Cat cat, Dog dog, LoudDog loudDog) {
        kennel[0] = new Cat("Cat");
        kennel[1] = new Dog("Dog");
        kennel[2] = new LoudDog("Loud Dog");
    }

    public void allSpeak() {
        for (int i = 0; i < kennel.length; i ++) {
            System.out.println(kennel[i].getName() + ": '" + kennel[i].speak() + "'");
        }
    }

}