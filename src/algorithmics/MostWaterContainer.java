package algorithmics;

/**
 * Dada una lista de numeros que representan un grupo de lineas de diferentes alturas.
 * Encuentra 2 lineas que formen un contenedor, tal que este contenga la mayor cantidad de agua.
 * Devuelve la cantidad maxima de agua que puede almacenar un contenedor.
 *
 * Given a number's list that represents a group of lines with different heights.
 * Find 2 lines that form a container, such that this contains the most water quantity.
 * Return the quantity of water that could load this container found.
 *
 * For instance: alturas/heights = [1,8,6,2,5,4,8,3,7] -> 49
 * Hints: Represents in a graphic of X & Y bars.
 */
public class MostWaterContainer {

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7}; //-> 49
        //int[] heights = {1,7,6,2,5,4,8,3,8}; //-> 49
        System.out.println(maxArea(heights));
    }

    private static int maxArea(int[] heights) {
        int maxArea = 0;
        //create 2 pointers p1 and p2 that represents both extremes
        int left = 0, right = heights.length - 1;
        //while 2 pointer are not the same
        while (left < right) {
            //take p1 value, and multiply by the distance between 2 pointers ((p1 - p2)+1)
            //Save this area that the maxArea
            //Compare with the next area to see which one is bigger
            maxArea = Math.max(maxArea, heights[left] * heights[right] +1);
            left++;
            right--;
        }
        //Return the biggest area that represents the quantity of water that the biggest container was found.
        return maxArea;
    }
}
/**
 * Complex: Spacial:O(1) Time:O(n)
 */
