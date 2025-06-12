package Aston.step1.Animals;

public class Fish extends Animal implements InWater, HasSpine, IsMammal, HasWool{
    @Override
    void printInfo() {
        System.out.println(hasSpine() ? "Fish has a spine" : "Fish doesn't have spine");
        System.out.println(hasWool() ? "Fish has a wool" : "Fish doesn't have wool");
        System.out.println(isMammal() ? "Fish is a mammal" : "Fish is not a mammal");
        System.out.println(inWater() ? "Fish lives in water" : "Fish doesn't live in water");
    }

    @Override
    public boolean hasSpine() {
        return true;
    }

    @Override
    public boolean inWater() {
        return true;
    }

    @Override
    public boolean hasWool() {
        return false;
    }

    @Override
    public boolean isMammal() {
        return false;
    }
}
