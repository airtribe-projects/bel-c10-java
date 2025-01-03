package org.example.lsp;

class RowBoat extends Vehicle {
    @Override
    public void move() {
        System.out.println("RowBoat is being rowed manually");
    }

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("RowBoat does not have an engine!");
    }
}