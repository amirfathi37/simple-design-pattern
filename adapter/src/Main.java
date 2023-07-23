public class Main {
    public static void main(String[] args) {
        MicroUSBCharger microUSBCharger = new MicroUSBCharger();
        MicroUSBCharger2TypeCAdaptor adaptor = new MicroUSBCharger2TypeCAdaptor(microUSBCharger);
        chargePhone(adaptor);

    }

    private static void chargePhone(TypeCCharger typeCCharger){
        typeCCharger.charge();
    }
}