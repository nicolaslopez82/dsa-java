package designpatterns.decorator;


/**
 * Concrete Decorators
 * These classes extend the PizzaDecorator and add specific toppings.
 */
public class PepperoniPizza extends PizzaDecorator {
    public PepperoniPizza(IPizza pizzaWrapper) {
        super(pizzaWrapper);
    }
    @Override
    public String getDescription() {
        return pizzaWrapper.getDescription() + ", Pepperoni Pizza";
    }

    @Override
    public double getPrice(){
        return pizzaWrapper.getPrice() + 0.5;
    }
}
