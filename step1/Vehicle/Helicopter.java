package Aston.step1.Vehicle;

public class Helicopter extends Vehicle implements HasWheels, HasPropeller,HasWings, HasCargo{
    @Override
    public boolean HasCargo() {
        return true;
    }

    @Override
    public boolean HasPropeller() {
        return true;
    }

    @Override
    public boolean HasWheels() {
        return true;
    }

    @Override
    public boolean HasWings() {
        return false;
    }
}
