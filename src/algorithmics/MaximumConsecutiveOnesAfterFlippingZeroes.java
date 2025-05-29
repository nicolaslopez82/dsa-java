package algorithmics;

public class MaximumConsecutiveOnesAfterFlippingZeroes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};


        int k = 2;
        System.out.println(maxOnes(arr, k));
    }

    public static int maxOnes(int[] arr, int k) {
        int result = 0;
        int pLeft = 0;
        int zeroCounter = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 0) {
                zeroCounter++;

                while (zeroCounter > k) {
                    if (arr[pLeft] == 0){
                        zeroCounter--;
                    }
                    pLeft++;
                }
            }
            result = Math.max(result, end - pLeft + 1);
        }
        return result;
    }
}
