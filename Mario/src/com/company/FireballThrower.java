package com.company;

public interface FireballThrower {

        default void throwBall(){
        System.out.println("Throw Fireball");
    }
}
