package com.p5.adoptions.model;

public class Animal extends AbstractAnimal implements AnimalInterface{

    private String name;
    private String photo;

    public Animal()
    {
    }

    public Animal(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    @Override
    public String makeSound()
    {
        return "nothing";
    }

    /**
     * Only visible in this class and in those that extends
     */

    protected String secondSound()
    {
    return "Nothing2";
    }

    @Override
    public String whatDoesItEat() {
        return "Unknown";
    }



    // Getters and Setters

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Animal setPhoto(String photo) {
        this.photo = photo;
        return this;
    }


    @Override
    public String howManyLegs() {
        return null;
    }

    @Override
    public String defauldMethod() {
        return null;
    }
}
