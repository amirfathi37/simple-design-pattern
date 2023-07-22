public class Main {
    public static void main(String[] args) {
        MicroUSBCharger microUSBCharger = new MicroUSBCharger();
        MicroUSBCharger2TypeCAdaptor adaptor = new MicroUSBCharger2TypeCAdaptor(microUSBCharger);
        chargePhone(adaptor);
        LighteningCharger lighteningCharger = new LighteningCharger();
        Lightening2TypeCAdaptor adaptor1 = new Lightening2TypeCAdaptor(lighteningCharger);
        chargePhone(adaptor1);
    }

    private static void chargePhone(TypeCCharger typeCCharger){
        typeCCharger.charge();
    }
}