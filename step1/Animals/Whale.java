package Aston.step1.Animals;

public class Whale extends Animal implements InWater, Mammal{
    @Override
    void printInfo() {
        System.out.println("Whale live in water: " + inWater());
        System.out.println("The whale is a mammal " + mammal());
    }

    @Override
    public boolean inWater() {
        return true;
    }

    @Override
    public boolean mammal() {
        return true;
    }
}
