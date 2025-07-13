package Aston.step5.Adapter;

public class ChargerAdapter implements USBTypeC {
    private final MicroUSB microUSB;

    public ChargerAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("Использование переходника с адаптером");
        microUSB.chargeMicroUSB();
    }
}
