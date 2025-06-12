package Aston.step1.Vehicle;

public class Airplane extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasCargo() {
        return true;
    }

    @Override
    public boolean hasPropeller() {
        return true;
    }

    @Override
    public boolean hasWings() {
        return true;
    }
}
