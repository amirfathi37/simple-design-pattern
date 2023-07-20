public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Any any = new Any();
        any.setAtt("first attribute.");
        Any cloned = (Any)any.clone();
        System.out.println(cloned.getAtt());
    }
}