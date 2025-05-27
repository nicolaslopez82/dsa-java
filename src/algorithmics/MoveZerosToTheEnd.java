package algorithmics;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int [] array = {0,1,0,3,12};
        //Output -> [1,3,12,0,0]
        moveZeroes(array);
        System.out.printf(Arrays.toString(array));
    }

    public static void moveZeroes(int[] array) {
        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }
        while (nonZeroIndex < array.length) {
            array[nonZeroIndex++] = 0;
        }
    }
}
