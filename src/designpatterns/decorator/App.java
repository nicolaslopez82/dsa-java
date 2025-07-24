package designpatterns.decorator;

public class App {
    public static void main(String[] args) {
        IPizza pizza = new Pizza();
        System.out.println(pizza.getDescription());;
        System.out.println(pizza.getPrice());

        pizza = new MushroomPizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        pizza = new PepperoniPizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        pizza = new OlivePizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
