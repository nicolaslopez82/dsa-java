package functionalprogramming.finalproject;

import java.util.*;
import java.util.stream.Collectors;

public class AppFinalFunctionalProgramming {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Manzana", "Frutas", 1, 2.5),
                new Product("Leche", "Lacteos", 2, 1.2),
                new Product("Pan", "Panaderia", 5, 1.0),
                new Product("Yogurt", "Lacteos", 3, 1.8),
                new Product("Pera", "Frutas", 4, 3.0),
                new Product("Naranja", "Frutas", 6, 2.0),
                new Product("Queso", "Lacteos", 2, 3.5),
                new Product("Manteca", "Lacteos", 1, 2.2),
                new Product("Harina", "Panaderia", 3, 1.5),
                new Product("Arroz", "Alimentos", 4, 1.8),
                new Product("Tomate", "Verduras", 5, 1.2),
                new Product("Lechuga", "Verduras", 2, 0.9),
                new Product("Pescado", "Pescaderia", 1, 4.0),
                new Product("Pollo", "Carnes", 3, 5.0),
                new Product("Carne", "Carnes", 2, 6.5)
        );

        /** Filter products by category: Frutas. */
        products.stream().filter(product ->  product.getCategory().equals("Frutas")).forEach(System.out::println);

        /** Calculate the total price of all products that are in the 'Lacteos' category.*/
        double totalPriceLacteosCategory = products.stream()
                .filter(product -> product.getCategory().equals("Lacteos"))
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("Total price of Lacteos Category: " + totalPriceLacteosCategory);


        /** Get Product with the lowest price. */
        // Other alternative without contemplate NPE -> Product productWithLowestPrice = products.stream().min(Comparator.comparing(Product::getPrice)).get();
        Product productWithLowestPrice = products.stream().min(Comparator.comparing(Product::getPrice)).orElse(new Product("ProductNotAvailable", "NotCategory", 0, 0));
        System.out.println("The product with the lowest price: " + productWithLowestPrice);

        /** Group Product by Category. */
        System.out.println("Group Product by Category: " );
        Map<String, List<Product>> map = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        map.forEach((k,v)->{System.out.println(k + ": " + v);});

        /** Calculate the average price of each category
         * and show the category with the average highest price */
        /** */
        Map<String, Double> averagePriceByCategory = new HashMap<>();
        List<String> categories = products.stream().map(Product::getCategory).collect(Collectors.toList());

        for(String category : categories){
            OptionalDouble optionalV = products.stream()
                    .filter(product -> product.getCategory().equals(category))
                    .mapToDouble(Product::getPrice)
                    .average();
            if (optionalV.isPresent()) {
                averagePriceByCategory.put(category, optionalV.getAsDouble());
            }
        }
        System.out.println('\n' + "Show all categories with the average highest price: ");
        averagePriceByCategory.forEach((k,v)->{System.out.println(k + ": " + v);});

        System.out.println('\n' + "Show the category with the average highest price: ");
        Double categoryWithTheAverageHighestPriceD = Collections.max(averagePriceByCategory.values());
        String categoryWithTheAverageHighestPriceS = findKeyByValueStream(averagePriceByCategory, categoryWithTheAverageHighestPriceD);
        System.out.println("Category: " + categoryWithTheAverageHighestPriceS + " - Average: " + categoryWithTheAverageHighestPriceD);

        /** Calculate the average price of each category
         * and show the category with the average highest price */
        /** */
        System.out.println("Calculate the average price of each category\n" +
                "         * and show the category with the average highest price\n " +
                "BETTER SOLUTION: ");
        Map<String, Double> mapAveragePriceByCategory = products.parallelStream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        mapAveragePriceByCategory.forEach((k,v)->{System.out.println(k + ": " + v);});

        System.out.println('\n' + "Show the category with the average highest price - BETTER SOLUTION: ");
        String highestAveragePriceByCategory = mapAveragePriceByCategory.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("Not Available");
        System.out.println("Category: " + highestAveragePriceByCategory +  " - Average: " + mapAveragePriceByCategory.get(highestAveragePriceByCategory));


    }

    public static <K, V> K findKeyByValueStream(Map<K, V> map, V value) {
        Optional<K> key = map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(value))
                .map(Map.Entry::getKey)
                .findFirst(); // Finds the first matching key
        return key.orElse(null);
    }
}
