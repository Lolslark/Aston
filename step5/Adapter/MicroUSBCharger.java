package Aston.step5.Adapter;

public class MicroUSBCharger implements MicroUSB {
    @Override
    public void chargeMicroUSB() {
        System.out.println("Зарядка через MicroUSB...");
    }
}
