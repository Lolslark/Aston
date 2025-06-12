package Aston.step1.Vehicle;

public class Airplane extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{

    @Override
    public boolean HasWheels() {
        return true;
    }

    @Override
    public boolean HasCargo() {
        return true;
    }

    @Override
    public boolean HasPropeller() {
        return true;
    }

    @Override
    public boolean HasWings() {
        return true;
    }
}
