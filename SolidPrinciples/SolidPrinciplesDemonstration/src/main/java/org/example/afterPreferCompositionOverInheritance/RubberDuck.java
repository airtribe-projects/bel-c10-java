package org.example.afterPreferCompositionOverInheritance;

class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak()); // Rubber duck can't fly, but squeaks
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}
