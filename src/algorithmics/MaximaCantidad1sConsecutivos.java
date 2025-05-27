package algorithmics;

public class MaximaCantidad1sConsecutivos {

    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int pOnes = 0;
        int pZeros = 0;
        int zeroCounter = 0;
        int oneCounter = 0;
        int result = 0;

        while (pOnes < nums.length) {

            if(nums[pOnes] == 1){
                oneCounter++;
                pOnes++;

            }else{
                result = Math.max(result, oneCounter);
                oneCounter = 0;
                while(zeroCounter < k && nums[pOnes] == 0){
                    zeroCounter++;
                    pOnes++;
                    if(pOnes == nums.length){
                        System.out.printf("Cantidad de consecutivos: %d", result);
                        return;
                    }
                }
                while(zeroCounter > 0){
                    nums[pOnes] = 1;
                    zeroCounter--;
                    pOnes--;
                }
                pZeros = pOnes;
                pOnes++;
            }
            result = Math.max(result, oneCounter);
        }
        System.out.printf("Cantidad de consecutivos: %d", oneCounter);
    }
}
