package Aston.step1.Vehicle;

public class Taxi extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
    @Override
    public boolean hasCargo() {
        return false;
    }

    @Override
    public boolean hasPropeller() {
        return false;
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasWings() {
        return false;
    }
}
