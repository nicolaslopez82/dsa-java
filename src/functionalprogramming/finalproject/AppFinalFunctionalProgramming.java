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
        Product productWithLowestPrice = products.stream().min(Comparator.comparing(Product::getPrice)).get();
        System.out.println("The product with the lowest price: " + productWithLowestPrice);

        /** Group Product by Category. */
        System.out.println("Group Product by Category: " );
        Map<String, List<Product>> map = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        map.forEach((k,v)->{System.out.println(k + ": " + v);});

        /** */
        /** */
    }
}
