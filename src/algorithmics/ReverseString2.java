package algorithmics;

import java.util.Arrays;

public class ReverseString2 {

    public static void main(String[] args) {
        //char [] input = {'h', 'e', 'l', 'l', 'o'};
        char [] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        // output: olleh.
        // output: hannaH.

       for(int i = 0, j = input.length -1; i < input.length / 2; i++, j--) {
           char temp = input[i];
           input[i] = input[j];
           input[j] = temp;
       }
       System.out.println(Arrays.toString(input));
    }
}
