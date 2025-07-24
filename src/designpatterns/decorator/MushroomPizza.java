package designpatterns.decorator;

/**
 * Concrete Decorators
 * These classes extend the PizzaDecorator and add specific toppings.
 */
public class MushroomPizza extends PizzaDecorator {
    public MushroomPizza(IPizza pizzaWrapper) {
        super(pizzaWrapper);
    }

    @Override
    public String getDescription() {
        return pizzaWrapper.getDescription() + ", Mushroom Pizza";
    }
    @Override
    public double getPrice(){
        return pizzaWrapper.getPrice() + 0.9;
    }
}
