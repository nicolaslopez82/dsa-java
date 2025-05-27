package algorithmics;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters3 {

    public static void main(String[] args) {
        //String string = "abcabcbb";
        String string = "bbbbb";
        System.out.println(longestSubStringWithoutRepeatingCharacters3(string));
    }

    private static int longestSubStringWithoutRepeatingCharacters3(String string) {
        int result = 0;

        Set<Character> set = new HashSet<>();
        char [] chars = string.toCharArray();

        for (char aChar : chars) {
            if (!(set.add(aChar))) {
                set.remove(aChar);
                result = Math.max(result, set.size());
            }
            result = Math.max(result, set.size());
        }
        return result;
    }
}
