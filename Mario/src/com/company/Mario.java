package com.company;

public class Mario extends Character implements FireballThrower, GiantStromper{


    protected Mario() {
        super();
    }


    @Override
    void run() {
        System.out.println(getName() + " is running");

    }

    @Override
    void jump() {
        System.out.println(getName() + " is jump");
    }



}

