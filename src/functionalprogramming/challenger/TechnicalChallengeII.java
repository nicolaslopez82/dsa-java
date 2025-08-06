package functionalprogramming.challenger;

import java.util.*;
import java.util.function.Predicate;

public class TechnicalChallengeII {
    public static void main(String[] args) {
        List<Car> listCars = Arrays.asList(
                new Car("Volkswagen", "Amarok", 25000),
                new Car("Volkswagen", "Taos", 32000),
                new Car("Chevrolet", "Onix", 22000),
                new Car("Chevrolet", "Tracker", 30000),
                new Car("Fiat", "Cronos", 21000),
                new Car("Fiat", "Pulse", 24000),
                new Car("Toyota", "Corolla", 28000),
                new Car("Toyota", "Yaris", 23000),
                new Car("Renault", "Stepway", 20000),
                new Car("Renault", "Duster", 27000),
                new Car("Nissan", "Versa", 25000)
        );

        // 1. Ordenar por precio de menor a mayor mediante sort
        System.out.println("Ordenado por precio de menor a mayor mediante sort");
        List<Car> carsOrderByPrice = new ArrayList<>(listCars);
        Collections.sort(carsOrderByPrice, Comparator.comparing(Car::getPrice));
        carsOrderByPrice.stream().forEach(System.out::println);
        System.out.println("=================================");
        // 1. Ordenar por precio de menor a mayor mediante sort (Reversed)
        System.out.println("Ordenado por precio de menor a mayor mediante sort (Reversed)");
        List<Car> carsOrderByPriceReversed = new ArrayList<>(listCars);
        Collections.sort(carsOrderByPriceReversed, Comparator.comparing(Car::getPrice).reversed());
        carsOrderByPriceReversed.stream().forEach(System.out::println);


        System.out.println("--------------------------");
        // 2. Ordenar por marca y luego por precio usando sorted()
        System.out.println("Ordenado por marca y luego por precio usando sorted()");
        listCars.stream().sorted(Comparator.comparing(Car::getbrand).thenComparing(Comparator.comparing(Car::getPrice))).forEach(System.out::println);

        System.out.println("--------------------------");
        // 3. Cars cuyo precio no supere los 23000
        System.out.println("Filtrado Cars más baratos que 23000");
        listCars.stream().filter(c -> c.getPrice() <= 23000)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        // 4. Cars de marca Chevrolet o Volkswagen
        System.out.println("Filtrado Cars Chevrolet y Volkswagen");
        listCars.stream().filter(c -> c.getbrand().equals("Chevrolet") || c.getbrand().equals("Volkswagen"))
                .forEach(System.out::println);

        System.out.println("--------------------------");
        // 5. Cars cuyo modelo contiene al menos una “a”
        System.out.println("Filtrado Cars cuyo modelo tiene una a");
        listCars.stream().filter(c -> c.getModel().toLowerCase().contains("a"))
                .forEach(System.out::println);
    }
}
