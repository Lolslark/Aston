package Aston.step1.Animals;

public class Bear extends Animal implements HasSpine, HasWool, Mammal{
    @Override
    void printInfo() {
        System.out.println("Bear have a spine: " + hasSpine());
        System.out.println("Bear have a wool: " + hasWool());
        System.out.println("The bear is a mammal " + mammal());
    }

    @Override
    public boolean hasSpine() {
        return true;
    }

    @Override
    public boolean hasWool() {
        return true;
    }

    @Override
    public boolean mammal() {
        return true;
    }
}
