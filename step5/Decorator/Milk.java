package Aston.step5.Decorator;

public class Milk extends Decorator {
    public Milk(Drink beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + молоко";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 50.0;
    }
}
