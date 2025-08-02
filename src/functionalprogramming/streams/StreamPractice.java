package functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nicolas", "Martin", "Mateo");
        nameList.stream().forEach(System.out::println);

        List<String> countries = Arrays.asList("Norway", "Argentina", "Canada", "The United Kingdom", "Germany",
                                                "Uruguay", "Chile", "Ukraine", "Israel", "The United States");

        System.out.println("Countries that contains 'uk' letters:");
        countries.stream().filter(country -> country.
                                                    toLowerCase().
                                                    contains("uk")).
                                                    forEach(System.out::println);
    }
}
