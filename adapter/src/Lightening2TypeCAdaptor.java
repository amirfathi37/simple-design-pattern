public class Lightening2TypeCAdaptor implements TypeCCharger {
    private LighteningCharger lighteningCharger;

    public Lightening2TypeCAdaptor(LighteningCharger lighteningCharger) {
        this.lighteningCharger = lighteningCharger;
    }

    @Override
    public void charge() {
        lighteningCharger.chargeByLightening();
    }
}
