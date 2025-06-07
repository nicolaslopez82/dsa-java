package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * A partir de una cadena de carácteres debes encontrar la más larga subcadena de carácteres sin que se repita ningún carácter.
 *
 * Ejemplo 1:
 *
 * # Input
 * lengthOfLongestSubstring("abcabcbb")
 *
 * # Output
 * 3
 *
 * Ejemplo 2:
 *
 * # Input
 * lengthOfLongestSubstring("jdkafnlcdsalkxcmpoiuytfccv")
 *
 * # Output
 * 15
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //String s = "abcabcbb";
        String s = "jdkafnlcdsalkxcmpoiuytfccv";
        System.out.println("Output --> " + longestSubstringWithoutRepeatingCharacters(s));
    }

    public static int longestSubstringWithoutRepeatingCharacters(String s){

        int maxCounter = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(set.add(arr[i])){
                maxCounter = Math.max(maxCounter, set.size());
            }else {
                set.clear();
            }
        }
        return maxCounter;
    }
}
