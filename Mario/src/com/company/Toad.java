package com.company;

public class Toad extends Character{


    protected Toad() {
        super();
    }

    @Override
    void run() {
        System.out.println(getName() + " is running very fast");
    }

    @Override
    void jump() {
        System.out.println(getName() + " is jumping");
    }
}


