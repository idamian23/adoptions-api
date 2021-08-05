package com.p5.adoptions.model;

public class Dog extends Animal
{

    @Override
    public String makeSound()
    {
        return "Ham";
    }

    @Override
    public String whatDoesItEat(){
        return  "Bones";
    }
}
