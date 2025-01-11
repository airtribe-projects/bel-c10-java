package org.example.afterPreferCompositionOverInheritance;

class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack()); // Mallard flies with wings and quacks
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
}
