package designpatterns.decorator;

/**
 * Concrete Component
 * This class implements the IPizza interface and provides the basic implementation for a "plain" pizza.
 */
public class Pizza implements IPizza {
    @Override
    public String getDescription() {
        return "Description from Pizza";
    }

    @Override
    public double getPrice() {
        return 1;
    }
}
