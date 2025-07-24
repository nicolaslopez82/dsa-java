package designpatterns.factory;

import java.awt.*;

public class App {
    public static void main(String[] args) {

        Circle circle = (Circle) Shape.getShape("CIRCLE");
        Square square = (Square) Shape.getShape("SQUARE");
        Triangle triangle = (Triangle) Shape.getShape("TRIANGLE");

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
