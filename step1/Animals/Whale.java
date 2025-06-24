package Aston.step1.Animals;

public class Whale extends Animal implements InWater, IsMammal, HasWool, HasSpine{
    @Override
    void printInfo() {
        System.out.println(hasSpine() ? "Whale has a spine" : "Whale doesn't have spine");
        System.out.println(hasWool() ? "Whale has a wool" : "Whale doesn't have wool");
        System.out.println(isMammal() ? "Whale is a mammal" : "Whale is not a mammal");
        System.out.println(inWater() ? "Whale lives in water" : "Whale doesn't live in water");
    }

    @Override
    public boolean inWater() {
        return true;
    }

    @Override
    public boolean isMammal() {
        return true;
    }

    @Override
    public boolean hasSpine() {
        return true;
    }

    @Override
    public boolean hasWool() {
        return false;
    }
}
