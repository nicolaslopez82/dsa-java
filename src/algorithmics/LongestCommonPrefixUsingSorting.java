package algorithmics;

import java.util.Arrays;

/**
 *
 * Longest Common Prefix using Sorting:
 * Given an array of strings arr[], the task is to return the longest common prefix among each and every strings present
 * in the array. If there’s no prefix common in all the strings, return “”.
 *
 * Approach:
 * The idea is to sort the array of strings and find the common prefix of the first and last string of the sorted array.
 * Sorting is used in this approach because it makes it easier to find the longest common prefix. When we sort the
 * strings, the first and last strings in the sorted list will be the most different from each other in terms of their
 * characters. So, the longest common prefix for all the strings must be a prefix of both the first and the last strings
 * in the sorted list.
 *
 * Examples:
 *
 * Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
 * Output: “gee”
 * Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.
 *
 * Input: arr[] = [“apple”, “ape”, “april”]
 * Output : “ap”
 * Explanation: “ap” is the longest common prefix in all the given strings: “apple”, “ape” and “april”.
 *
 * Input: arr[] = [“hello”, “world”]
 * Output: “”
 * Explanation: There’s no common prefix in the given strings.
 */

public class LongestCommonPrefixUsingSorting {
    public static void main(String[] args) {
        String[] arr = { "geeksforgeeks", "geeks", "geek", "geezer" };
        //String[] arr = {"apple", "ape", "april"};
        //String[] arr = {"hello", "world"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int lastStringLength = strs[strs.length - 1].length();
        int lastStringIndex = strs.length - 1;

        int min = Math.min(strs[0].length(), lastStringLength);

        for (int i = 0; i < min; i++) {
            if (strs[0].charAt(i) != strs[lastStringIndex].charAt(i)) {
                return sb.toString();
            }else{
                sb.append(strs[0].charAt(i));
            }
        }
        return "";
    }
}
