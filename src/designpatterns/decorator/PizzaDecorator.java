package designpatterns.decorator;


/**
 * Abstract Decorator
 *
 * This class implements the IPizza interface and holds a reference to a Pizza object.
 * It delegates operations to the wrapped pizza object.
 */
public abstract class PizzaDecorator implements IPizza {
    protected IPizza pizzaWrapper;

    public PizzaDecorator(IPizza pizzaWrapper) {
        this.pizzaWrapper = pizzaWrapper;
    }

    @Override
    public String getDescription() {
        return pizzaWrapper.getDescription();
    }

    @Override
    public double getPrice() {
        return pizzaWrapper.getPrice();
    }
}
