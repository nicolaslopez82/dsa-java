package algorithmics;

/**
 * Given a number n, find the sum of its digits.
 *
 * Examples :
 *
 * Input: n = 687
 * Output: 21
 * Explanation: The sum of its digits are: 6 + 8 + 7 = 21
 *
 * Input: n = 12
 * Output: 3
 * Explanation: The sum of its digits are: 1 + 2 = 3
 *
 * Digit Extraction - O(log10n) Time and O(1) Space
 */

class SumOfDigits {
    static int sumOfDig(int n) {
        int sum = 0;
        while (n != 0) {
            // Extract the last digit
            int last = n % 10;

            // Add last digit to sum
            sum += last;

            // Remove the last digit
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDig(n));
    }
}