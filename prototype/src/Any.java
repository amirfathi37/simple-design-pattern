public class Any implements Cloneable {
    private String att;

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public Any() {
    }

    public Any(Any targetAny) {
        this.att = targetAny.getAtt();
    }


    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    protected Any clone() {
        return new Any(this);
    }
}
