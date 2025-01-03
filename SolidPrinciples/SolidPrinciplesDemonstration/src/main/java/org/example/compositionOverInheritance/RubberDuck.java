package org.example.compositionOverInheritance;

class RubberDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("Rubber Duck can't fly");
    }

    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}