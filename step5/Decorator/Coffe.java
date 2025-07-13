package Aston.step5.Decorator;

public class Coffe implements Drink {

    @Override
    public String getDescription() {
        return "Кофе";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
