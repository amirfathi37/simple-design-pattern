public class MicroUSBCharger2TypeCAdaptor implements TypeCCharger {
    private MicroUSBCharger microUSBCharger;

    public MicroUSBCharger2TypeCAdaptor(MicroUSBCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void charge() {
        microUSBCharger.charge();
    }
}
