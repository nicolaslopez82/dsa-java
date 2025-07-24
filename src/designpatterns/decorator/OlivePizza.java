package designpatterns.decorator;

/**
 * Concrete Decorators
 * These classes extend the PizzaDecorator and add specific toppings.
 */
public class OlivePizza extends PizzaDecorator {
    public OlivePizza(IPizza pizzaWrapper) {
        super(pizzaWrapper);
    }
    @Override
    public String getDescription() {
        return pizzaWrapper.getDescription() + ", Olive Pizza";
    }
    @Override
    public double getPrice() {
        return pizzaWrapper.getPrice() + 0.7;
    }
}
