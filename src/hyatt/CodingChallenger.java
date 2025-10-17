package hyatt;

import java.util.HashMap;
import java.util.Map;

/**
 * Task:
 Assign values to the alphabets in an order such that:
 a = 1, b = 2, c = 3, ..., z = 26
 Then, take an alphabetical string as input and calculate the sum of the corresponding values of its characters.
 Example:
 Input: hello
 Output: 52
 Explanation: 8+5+12+12+15 = 52
 */

public class CodingChallenger {

    public static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        String str = "abc";
        System.out.println(returnTotalValue(str));
    }

    public static int returnTotalValue(String str){

        Integer result = 0;

        for(int index = 0; index <= str.length() - 1; index++){
            result += (int) map.get((Character)str.charAt(index));
        }

        return result;
    }
}
