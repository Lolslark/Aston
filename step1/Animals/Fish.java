package Aston.step1.Animals;

public class Fish extends Animal implements InWater, HasSpine{
    @Override
    void printInfo() {
        System.out.println("Fish live in water: " + inWater());
        System.out.println("Fish have a spine:+ " + hasSpine());
    }

    @Override
    public boolean hasSpine() {
        return true;
    }

    @Override
    public boolean inWater() {
        return true;
    }
}
