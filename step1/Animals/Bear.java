package Aston.step1.Animals;

public class Bear extends Animal implements HasSpine, HasWool, IsMammal, InWater{
    @Override
    void printInfo() {
        System.out.println(hasSpine() ? "Bear has a spine" : "Bear doesn't have spine");
        System.out.println(hasWool() ? "Bear has a wool" : "Bear doesn't have wool");
        System.out.println(isMammal() ? "Bear is a mammal" : "Bear is not a mammal");
        System.out.println(inWater() ? "Bear lives in water" : "Bear doesn't live in water");
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
