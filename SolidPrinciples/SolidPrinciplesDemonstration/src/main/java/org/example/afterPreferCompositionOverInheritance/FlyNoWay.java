package org.example.afterPreferCompositionOverInheritance;

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Duck can't fly");
    }
}