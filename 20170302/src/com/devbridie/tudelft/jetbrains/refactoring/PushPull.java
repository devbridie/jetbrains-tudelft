package com.devbridie.tudelft.jetbrains.refactoring;

public class PushPull {
    class Animal {

    }

    class Cat extends Animal {
        public void purr() {
            System.out.println("Purr.");
        }
    }
    class Bear extends Animal {
        //TODO: Apparently bears can purr.
        public void hunt(Salmon s) {
            System.out.println("Caught salmon!");
        }
    }


    class Salmon {}
}
