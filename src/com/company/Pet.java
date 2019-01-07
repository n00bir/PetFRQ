package com.company;

public abstract class Pet {
    private String Name;

    public Pet(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public abstract String speak();

}