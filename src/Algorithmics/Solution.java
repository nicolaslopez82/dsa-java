package Algorithmics;

public class Solution {

    public static void main(String[] args) {

        String[] arr = new String[3];

        arr[0] = "flower";
        arr[1] = "flow";
        arr[2] = "flight";
        System.out.println(longestCommonPrefix(arr));
    }



    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
