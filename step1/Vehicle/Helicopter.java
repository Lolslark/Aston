package Aston.step1.Vehicle;

public class Helicopter extends Vehicle implements HasWheels, HasPropeller,HasWings, HasCargo{
    @Override
    public boolean hasCargo() {
        return true;
    }

    @Override
    public boolean hasPropeller() {
        return true;
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
