package functionalprogramming.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        /** Reference to Static Method */
        System.out.println("Reference to Static Method: ");
        Function<Integer, String> converter = String::valueOf;
        System.out.println(converter.apply(45));

        System.out.println('\n');

        /** Reference to Instance Object Method. */
        System.out.println("Reference to Instance Object Method: ");
        Person person1 = new Person();
        person1.setName("Nicolas");
        Runnable info = person1::getName;
        info.run();

        System.out.println('\n');

        /** Reference to a Constructor */
        System.out.println("Reference to a Constructor: ");
        BiFunction<String, Integer, Person> createPerson = Person::new;
        Person person2 = createPerson.apply("Martin", 42);
        System.out.println(person2.toString());

        System.out.println('\n');

        /** Reference to Arbitrary Instance Object Method */
        System.out.println("Reference to Arbitrary Instance Object Method: ");

        List<Person> personList = new ArrayList<>();
        personList.add(new Employee("Employee1"));
        personList.add(new Manager("Manager1"));
        personList.add(new Employee("Employee2"));
        personList.add(new Manager("Manager2"));

        personList.forEach(Person::greeting);
    }
}
