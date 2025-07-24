package designpatterns.factory;

public class Square extends Shape implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
