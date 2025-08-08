package functionalprogramming.optionals;

import functionalprogramming.challenger.Car;

import java.util.Optional;

/**
 * Optional es una clase que se introdujo en Java 8 como parte del paquete java.util.
 *
 * Su proposito principal, es proporcionar una forma mas segura de manejar valores
 * que pueden ser nulos y evitar el clasico: "NullPointerException".
 */

public class OptionalPractice {
    public static void main(String[] args) {


        Optional<String> optionalCarNullString = Optional.ofNullable("");

        if (optionalCarNullString.isEmpty()) {
            System.out.println("Optional optionalCarNullString is Empty");
        }
        if (optionalCarNullString == null) {
            System.out.println("Optional optionalCarNullString is Null");
        }
        if (optionalCarNullString.isPresent()) {
            System.out.println("Optional optionalCarNullString is Present");
        }

        System.out.println("==========================" + '\n');

        // Crea un Optional que puede estar vacio si el valor es null.
        // Optional.ofNullable(...) transforma un objeto null, en un objeto vacio.
        Optional<Car> optionalCarNull = Optional.ofNullable(null);

        if (optionalCarNull.isEmpty()) {
            System.out.println("Optional optionalCarNull is Empty");
        }
        if (optionalCarNull == null) {
            System.out.println("Optional optionalCarNull is Null");
        }
        if (optionalCarNull.isPresent()) {
            System.out.println("Optional optionalCarNull is Present");
        }

        System.out.println("==========================" + '\n');

        // Crea un Optional con un valor (Lanza una exception si es null).
        Optional<Car> optionalCarOf = Optional.of(new Car());

        if (optionalCarOf.isEmpty()) {
            System.out.println("Optional optionalCarOf is Empty");
        }
        if (optionalCarOf == null) {
            System.out.println("Optional optionalCarOf is Null");
        }
        if (optionalCarOf.isPresent()) {
            System.out.println("Optional optionalCarOf is Present");
        }

        System.out.println("==========================" + '\n');

        // Crea un Optional vacio (Optional.empty()).
        // Optional.empty(); Genera un objeto de tipo Car, pero vacio.
        Optional<Car> optionalCarEmpty = Optional.empty();
        if (optionalCarEmpty.isEmpty()) {
            System.out.println("Optional optionalCarEmpty is Empty");
        }
        if (optionalCarEmpty == null) {
            System.out.println("Optional optionalCarEmpty is Null");
        }
        if (optionalCarEmpty.isPresent()) {
            System.out.println("Optional optionalCarEmpty is Present");
        }
    }
}
