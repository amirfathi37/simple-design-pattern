public class ShapeFactory {
    public Shape createShapeFactory(String type) {
        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        if (type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }


}
