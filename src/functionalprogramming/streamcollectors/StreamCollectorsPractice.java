package functionalprogramming.streamcollectors;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectorsPractice {

    public static void main(String[] args) {

        /** Collectors.toList() */
        System.out.println('\n' + "Collectors.toList(): ");
        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP", "Golang");
        System.out.println("languages: " + languages);
        languages.forEach(System.out::println);
        System.out.println("languages that contains 'P': ");
        languages.stream().filter(l -> l.toUpperCase().contains("P")).forEach(System.out::println);

        /** Collectors.toSet() */
        System.out.println('\n' + "Collectors.toSet(): ");
        List<String> countries = Arrays.asList("India", "USA", "UK", "Ukraine", "Canada",
                                               "Brazil", "Germany", "Turkey", "Argentina", "Chile",
                                                "Paraguay", "Brazil", "Canada");
        System.out.println("countries: " + countries);
        //Set<String> setCountries = countries.stream().collect(Collectors.toSet());
        //setCountries.forEach(System.out::println);
        Set<String> countriesSet = new HashSet<>(countries);
        System.out.println("countriesSet: " + countriesSet);
        //countriesSet.forEach(System.out::println);

        /** Collectors.partitioningBy() */
        System.out.println('\n' + "Collectors.partitioningBy(): ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("numbers: " + numbers);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy( n -> n % 2 == 0 ));
        System.out.println("map: " + map);
    }
}
