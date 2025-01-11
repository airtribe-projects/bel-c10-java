package org.example.afterPreferCompositionOverInheritance;

class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    // Constructor to inject behaviors
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("I'm a Duck!");
    }
}