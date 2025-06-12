package Aston.step1.Vehicle;

public class Truck extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
    @Override
    public boolean hasCargo() {
        return true;
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
