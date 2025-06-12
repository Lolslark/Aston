package Aston.step1.Vehicle;

public class Truck extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
    @Override
    public boolean HasCargo() {
        return true;
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
