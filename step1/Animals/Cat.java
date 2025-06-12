package Aston.step1.Animals;

public class Cat extends Animal implements HasSpine, HasWool, Mammal{
    @Override
    public void printInfo() {
        System.out.println("Cat have a spine: " + hasSpine());
        System.out.println("Cat have a wool: " + hasWool());
        System.out.println("The cat is a mammal " + mammal());
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
