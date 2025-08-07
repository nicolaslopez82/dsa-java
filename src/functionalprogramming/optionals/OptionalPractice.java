package functionalprogramming.optionals;

import functionalprogramming.challenger.Car;

import java.util.Optional;

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

        // Optional.of(...) transforma un objeto null, en un objeto ya que prentende recibir siempre un valor.
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

        //Optional.empty(); Genera un objeto de tipo Car, pero vacio.
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
