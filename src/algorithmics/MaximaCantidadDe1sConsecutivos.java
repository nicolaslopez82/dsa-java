package algorithmics;


/**
 * # Entrada:
 * 	nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * # Salida:
 * 	6
 *
 * 	Explicación: [1,1,1,0,0,++1,1,1,1,1,1++] Los números en negrita se han pasado de 0 a 1. La submatriz más larga está subrayada.
 */

/**
 * The idea is to use two pointers, start and end, to mark the start and end points of the current subarray (or window). Initially, both pointers are set at the beginning of the array. Continuously increase the size of the current window by incrementing the end pointer while keeping track of the count of zeros within the window. If at any point the count of zeros exceeds k, shrink the window by incrementing the start pointer until the count is reduced to k. The result will be the maximum length among all windows that contain at most k zeros.
 */

public class MaximaCantidadDe1sConsecutivos {

    static int maxOnes(int[] arr, int k) {
        int res = 0;

        // Start and end pointer of the window
        int start = 0, end = 0;

        // Counter to keep track of zeros in current window
        int cnt = 0;

        while (end < arr.length) {
            if (arr[end] == 0)
                cnt++;

            // Shrink the window from left if
            // no. of zeroes are greater than k
            while (cnt > k) {
                if (arr[start] == 0)
                    cnt--;

                start++;
            }

            res = Math.max(res, (end - start + 1));

            // Increment the end pointer to expand the window
            end++;
        }

        return res;
    }

    public static void main(String[] args) {
       // int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxOnes(arr, k));
    }
}
