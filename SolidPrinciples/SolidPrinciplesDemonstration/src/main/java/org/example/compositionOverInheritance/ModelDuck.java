package org.example.compositionOverInheritance;

class ModelDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("Model Duck can't fly");
    }

    public void display() {
        System.out.println("I am a Model Duck");
    }
}