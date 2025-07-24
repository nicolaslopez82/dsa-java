package designpatterns.factory;

public class Triangle extends Shape implements IShape{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
