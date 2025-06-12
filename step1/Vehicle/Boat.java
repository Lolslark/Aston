package Aston.step1.Vehicle;

public class Boat extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
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
        return false;
    }

    @Override
    public boolean HasWings() {
        return false;
    }
}
