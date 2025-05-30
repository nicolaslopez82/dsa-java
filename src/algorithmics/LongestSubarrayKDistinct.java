package algorithmics;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayKDistinct {

    public static void main(String[] args) {
        LongestSubarrayKDistinct solution = new LongestSubarrayKDistinct();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(lengthOfLongestSubarrayKDistinct(nums, k)); // Output: 4
    }

    public static int lengthOfLongestSubarrayKDistinct(int[] nums, int k) {
        int pLeft = 0;
        int result = 0;
        // HashMap to store the count of each integer in the current window
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array with the right pointer
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the count map
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            // If the number of distinct integers exceeds k, shrink the window
                while (map.size() > k ) {
                    map.put(nums[pLeft], map.get(nums[pLeft]) - 1);
                    if (map.get(nums[pLeft]) == 0) {
                        map.remove(nums[pLeft]);
                    }
                    pLeft++;
                }
            // Update the maximum length of the window
                result = Math.max(result, i - pLeft + 1);
            }
            return result;
        }
}
