package algorithmics;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        //String s = "abcabcfbb";
        String s = "jdkafnlcdsalkxcmpoiuytfccv";
        int k = s.length();
        System.out.println(longestSubstringWithOnlySet2(s, k));
    }

    private static int longestSubstringWithOnlySet2(String s, int k) {

        char[] chars = s.toCharArray();
        int pointer = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();

        while (pointer < chars.length) {
            if( set.add(chars[pointer]) ) {
                pointer++;
            }else {
                pointer++;
                result = Math.max(result, set.size());
                set.clear();
            }
        }
        return result;
    }
}
