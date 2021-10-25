package com.company;

public abstract class Character {

    private final String name;

    protected Character() {
        this.name = getClass().getName();
    }

    public String getName(){
        return name;
    }


    abstract void run();

    abstract void jump();

}
