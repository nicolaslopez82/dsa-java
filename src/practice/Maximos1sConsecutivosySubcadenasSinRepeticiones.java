package practice;

/**
 * Ejemplo 1:
 * # Entrada:
 * 	nums = [1,1,1,0,0,0,1,1,1,0], k = 2
 * # Salida:
 * 	6
 *
 * 	Ejemplo 2:
 * 	# Entrada:
 * 	nums = [0,0,1,1,0,0,1,1,0,1,1,0,0,1,1,1], k = 3
 * # Salida:
 * 	10
 */

public class Maximos1sConsecutivosySubcadenasSinRepeticiones {

    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,0};
        //int [] nums = {0,0,1,1,0,0,1,1,0,1,1,0,0,1,1,1};
        int k = 2;

        System.out.println(maximos1sConsecutivosySubcadenasSinRepeticionesII(nums, k));
    }

    public static int maximos1sConsecutivosySubcadenasSinRepeticiones(int [] nums, int k){

        int pLeft = 0, pRight = 0;
        int zeroCount = 0;
        int res = 0;

        while (pRight < nums.length){

            if (nums[pRight] != 0){
             zeroCount++;
             while(zeroCount > k){
                 zeroCount--;
                 pLeft++;
             }
            }

            pRight++;
            res = Math.max(res,pRight-pLeft);
        }
        return res;
    }

    public static int maximos1sConsecutivosySubcadenasSinRepeticionesII(int [] nums, int k){
        //int [] nums = {1,1,1,0,0,0,1,1,1,0};
        int pLeft = 0, pRight = 0;
        int zeroCount = 0;
        int res = 0;

        while (pRight < nums.length){

            if(nums[pRight] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[pLeft] == 0){
                    zeroCount--;
                }
                pLeft++;
            }

            res = Math.max(res,(pRight- pLeft) + 1);
            pRight++;
        }
        return res;
    }
}
