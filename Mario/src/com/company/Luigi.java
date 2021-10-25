package com.company;

public class Luigi extends Character implements FireballThrower{


    protected Luigi() {
        super();
    }

    @Override
    void run() {
        System.out.println(getName() + " is running");
    }

    @Override
    void jump() {
        System.out.println(getName() + " is jumping very high");
    }
}
