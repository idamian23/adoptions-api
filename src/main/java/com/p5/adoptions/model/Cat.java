package com.p5.adoptions.model;

public class Cat extends Animal implements AnimalInterface
{

    public Cat(String name, String photo) {
        super(name, photo);
    }

    @Override
    public String makeSound()
    {
        return "Miau";
    }

    @Override
    public String whatDoesItEat(){
        return  "milk";
    }


    @Override
    public String howManyLegs() {
        return "4";
    }

    // Second example of polymorphism
    public String customMethodToCats(){
        return "Cats are cool, only cats can do this";
    }

    public String customMethodToCats(String message){
        return message;
    }
}
