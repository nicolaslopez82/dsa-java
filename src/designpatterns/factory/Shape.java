package designpatterns.factory;

public class Shape {
    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "TRIANGLE":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}
