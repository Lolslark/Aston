package Aston.step5.Decorator;

public abstract class Decorator implements Drink {
    protected Drink drink;

    public Decorator(Drink beverage) {
        this.drink = beverage;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }

    @Override
    public double getCost() {
        return drink.getCost();
    }
}
