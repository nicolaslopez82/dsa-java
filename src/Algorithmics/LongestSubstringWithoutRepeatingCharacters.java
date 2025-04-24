package Algorithmics;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcfbb";
        int k = s.length();
        System.out.println(longestSubstringWithOnlySet(s, k));
    }

    private static int longestSubstringWithOnlySet(String s, int k) {
        Set<Character> set = new HashSet<>();
        int right, result = 0;
        char[] arr = s.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (right = 0; right < k; right++) {
            if(!(set.add(arr[right]))){
                for (int i = 0; i < set.size()-1; i++) {
                    String str = set.toString();
                    stringBuilder = new StringBuilder(str);
                }
                if(set.size()>result){
                    result = set.size();
                }
                set.clear();
                right--;
            }
        }
        System.out.println("The longest substring is: " + stringBuilder);
        return result;
    }
}
