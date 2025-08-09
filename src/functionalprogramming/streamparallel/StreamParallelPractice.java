package functionalprogramming.streamparallel;

import java.util.Arrays;

public class StreamParallelPractice {
    public static void main(String[] args) {

        int [] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.nanoTime();
        Arrays.stream(arrayNumbers).forEach(System.out::println);
        long end = System.nanoTime();
        System.out.printf("without parallel: " +  (end - start));

        start = System.nanoTime();
        Arrays.stream(arrayNumbers).parallel().forEach(System.out::println);
        end = System.nanoTime();
        System.out.printf("with parallel: " + (end - start));
    }
}
