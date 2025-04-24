package algorithmics;

/**
 * Debes escribir un algoritmo eficiente que busque un valor objetivo en una matriz de m x n enteros.
 *
 * La matriz tiene las siguientes propiedades:
 *
 * Los enteros de cada fila están ordenados de izquierda a derecha.
 *
 * El primer entero de cada fila es mayor al último entero de la fila anterior.
 *
 * Retorna True si el valor objetivo se encuentra en la matriz. Si no, retorna False.
 *
 * Ejemplo 1:
 * # Input
 * matriz = [
 *   [1,3,5,7],
 *   [10,11,16,20],
 *   [23,30,34,60],
 * ]
 * searchInMatrix(matriz, 3)
 * # Output
 * True
 *
 *
 * Ejemplo 2:
 * # Input
 * matriz = [
 *   [1,3,5,7],
 *   [10,11,16,20],
 *   [23,30,34,60],
 * ]
 * searchInMatrix(matriz, 12)
 * # Output
 * False
 */

public class Search2DArrayMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},
                          {10,11,16,20},
                          {23,30,34,60}};
        int target = 11;
        int[] row = getRow(matrix, target);
        if(row != null && binarySearch(row, target) != -1) {
            System.out.println("Target: " + target + " was found in the Matrix.");
        }else {
            System.out.println("Target: " + target + " not found in the Matrix.");
        }
    }

    private static int[] getRow(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
           int mid = left + (right - left) / 2;
           if(target < matrix[mid][0]) {
               right = mid - 1;
           } else if (target > matrix[mid][matrix[mid].length -1]) {
               left = mid + 1;
           } else {
               return matrix[mid];
           }
        }
        return null;
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {return mid;}
            if (arr[mid] > target) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
