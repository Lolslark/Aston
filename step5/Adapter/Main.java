package Aston.step5.Adapter;

public class Main {
    public static void main(String[] args) {
        MicroUSB charger = new MicroUSBCharger();

        USBTypeC adapter = new ChargerAdapter(charger);

        adapter.chargeWithTypeC();
    }
}
