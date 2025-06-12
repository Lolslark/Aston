package Aston.step1.Vehicle;

public class CargoShip extends Vehicle implements HasWheels, HasPropeller, HasWings, HasCargo{
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
        return false;
    }

    @Override
    public boolean hasWings() {
        return false;
    }
}
