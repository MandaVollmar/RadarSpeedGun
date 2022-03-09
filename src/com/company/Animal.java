package com.company;

public class Animal {
    // properties of animals
    private String name;
    private String type;

    //Methods for an animal
    public Animal (String name, String type) {
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public void buildAnimal () {
        System.out.println(name + " is a " +type);
    }

}
