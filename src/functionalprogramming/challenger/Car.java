package functionalprogramming.challenger;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private double price;

    public Car() {}

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Car(Car car) {
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if (this.price < car.price) {
            return -1;
        }else if (this.price > car.price) {
            return 1;
        }
        return 0;
    }

    public static Comparator<Car> COMPARE_BY_BRAND_AND_PRICE = new Comparator<Car>() {
        @Override
        public int compare(Car car1, Car car2){
            if (car1.getbrand().toLowerCase().compareTo(car2.getbrand().toLowerCase()) == 0) {
                return Math.toIntExact((long) ((int) car1.getPrice() - car2.getPrice()));
            }
            return car1.getbrand().toLowerCase().compareTo(car2.getbrand().toLowerCase());
        }
    };
}
