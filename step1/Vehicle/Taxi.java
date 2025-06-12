package Aston.step1.Vehicle;

public class Taxi extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
    @Override
    public boolean HasCargo() {
        return false;
    }

    @Override
    public boolean HasPropeller() {
        return false;
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
