package designpatterns.factory;

public class Circle extends Shape implements IShape {

    public Circle(){}

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
