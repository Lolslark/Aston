package Aston.step1.Animals;

public class Cat extends Animal implements HasSpine, HasWool, IsMammal, InWater{
    @Override
    public void printInfo() {
        System.out.println(hasSpine() ? "Cat has a spine" : "Cat doesn't have spine");
        System.out.println(hasWool() ? "Cat has a wool" : "Cat doesn't have wool");
        System.out.println(isMammal() ? "Cat is a mammal" : "Cat is not a mammal");
        System.out.println(inWater() ? "Cat lives in water" : "Cat doesn't live in water");
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
    public boolean isMammal() {
        return true;
    }

    @Override
    public boolean inWater() {
        return false;
    }
}
