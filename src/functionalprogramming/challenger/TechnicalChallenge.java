package functionalprogramming.challenger;

import java.util.*;
import java.util.stream.Collectors;

import static functionalprogramming.challenger.Car.COMPARE_BY_BRAND_AND_PRICE;

public class TechnicalChallenge {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
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
        //cars.forEach(System.out::println);

        IListCarsByPriceOrderByAscending iListCarsByPriceOrderByAscending = (carList -> carList.stream().sorted().collect(Collectors.toList()));
        System.out.println("Showing the car list by price ascending: ");
        iListCarsByPriceOrderByAscending.getCarsByPriceOrderByAscending(cars).forEach(System.out::println);

        System.out.println('\n');

        List<Car> carListReversed = iListCarsByPriceOrderByAscending.getCarsByPriceOrderByAscending(cars);
        Collections.reverse(carListReversed);
        System.out.println("Showing the car list by price descendant (reversed list by Collector.reverse(List list)): ");
        carListReversed.forEach(System.out::println);

        System.out.println('\n');

        System.out.println("Showing the car list by COMPARE_BY_BRAND_AND_PRICE Stream Comparator: ");
        cars.stream().sorted(COMPARE_BY_BRAND_AND_PRICE).forEach(System.out::println);

       /* IListCarsByBrandAndPrice iListCarsByBrandAndPrice = (carList) -> {

            for(int i = 0; i < carList.size(); i++){

            }
            if (car1.getbrand().toLowerCase().compareTo(car2.getbrand().toLowerCase()) == 0) {
                return Math.toIntExact((long) ((int) car1.getPrice() - car2.getPrice()));
            }
            return car1.getbrand().toLowerCase().compareTo(car2.getbrand().toLowerCase());
        };
        iListCarsByBrandAndPrice.getCarsByPriceOrderByAscending(cars)*/

        System.out.println('\n');

        System.out.println(cars.stream().filter(c -> c.getPrice() < 23000).toList());

        System.out.println('\n');

        cars.stream()
            .filter(c -> c.getbrand().contains("Chevrolet"))
                .forEach(System.out::println);
        cars.stream()
            .filter(c -> c.getbrand().contains("Volkswagen"))
                .forEach(System.out::println);

        System.out.println('\n');

        cars.stream().filter(c -> c.getModel().contains("a")).forEach(System.out::println);


        System.out.println('\n');

        System.out.println("Example of java stream using filter and map calling the function startwith, and then return it into a list of Strings: ");
        List<String> carsListP = cars.stream()
                .filter(c -> c.getModel().startsWith("T"))
                .map(c -> c.getModel())
                .collect(Collectors.toList());
                //.map(Car::new)


        carsListP.stream().forEach(System.out::println);


        System.out.println("Example of java stream using filter and map calling the function startwith, and then return it into a list of Strings: ");
        List<String> list = List.of("Dog", "Door", "Park", "Date");
        List<String> listOfStartWithD = list.stream()
                .filter(s -> s.toUpperCase().startsWith("D"))
                .map(s -> s)
                .toList();
        listOfStartWithD.stream().forEach(System.out::println);

        System.out.println('\n');

        System.out.println("Example of java stream using filter and map calling the function startwith, and then return it into a list of Strings: ");
        List<String> mutableList = new ArrayList<>(listOfStartWithD); //listOfStartWithD is immutable.
        Collections.reverse(mutableList);
        mutableList.stream().forEach(System.out::println);
    }
}
