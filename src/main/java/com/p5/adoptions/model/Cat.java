package com.p5.adoptions.model;

public class Cat extends Animal
{

    public Cat(String name, String photo) {
        super(name, photo);
    }

    @Override
    public String makeSound()
    {
        return "Miau" + secondSound();
    }

    @Override
    public String whatDoesItEat(){
        return  "milk";
    }




}
