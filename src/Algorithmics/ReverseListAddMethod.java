package Algorithmics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseListAddMethod {
    public static void main(String[] args)
    {
        List<Integer> number = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(
                "Reverse order of given List :- ");

        for (int k = 0, j = number.size() - 1; k < j; k++)
        {
            number.add(k, number.remove(j));
        }

        System.out.println(number);
    }
}
