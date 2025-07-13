package Aston.step5.Decorator;

public class Sugar extends Decorator {
    public Sugar(Drink beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + сахар";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 20.0;
    }
}
