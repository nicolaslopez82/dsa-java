package algorithmics;

/**
 * Tienes una lista de números enteros ordenada de forma ascendente y sin valores repetidos.
 *
 * Pero posiblemente la lista se encuentre rotada en un índice pivote desconocido.
 *
 * Por ejemplo, [0,1,2,4,5,6,7] podría girar en el índice pivote 3 y convertirse en [4,5,6,7,0,1,2].
 *
 * Dado un array nums (después de la posible rotación) y un entero objetivo, si objetivo se encuentra en nums,
 * devuelve su índide o posición en el array, si no, devuelve -1.
 *
 * Ejemplo 1:
 * // Input
 * const lista = [4,5,6,7,0,1,2];
 * const objetivo = 3;
 * searchInRotatedArray(lista, objetivo);
 *
 * // Output
 * -1
 *
 * Ejemplo 2:
 * // Input
 * const lista = [12,13,9,10,11];
 * const objetivo = 10;
 * searchInRotatedArray(lista, objetivo);
 *
 * // Output
 * 3
 */

public class SearchInRotatedArrays {
    public static void main(String[] args) {
        /**
         * Simple Binary Search
         */
        int[] arr = {13,24,35,46,54,68,79,80};
        int target = 68;
        //          [0, 1, 2, 3, 4, 5, 6, 7}
        //System.out.println(binarySearch(arr, target));

        /**
         * Search In Rotated Array
         */
        int[] arr1 = {4,5,6,7,0,1,2};
        int target1 = 3;
        // Output = -1.

        int[] arr2 = {12,13,9,10,11};
        int target2 = 10;
        // Output = 3.

        System.out.println(searchInRotatedArray(arr1, target1));
        System.out.println(searchInRotatedArray(arr2, target2));
    }

    /**
     * Complex Time: O(log n)
     */
    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {  return mid; }
            if (arr[mid] > target) { high = mid - 1; }
            if (arr[mid] < target) {low = mid + 1;}
        }
        return -1;
    }

    /**
     * Complex Time: O(log n)
     */
    //En conclusión, debes identificar si los elementos desde la mitad a la derecha están ordenados o rotados, y
    // después evaluar si el objetivo está en el intervalo ordenado o rotado y según eso mover los apuntadores
    // izquierda y derecha según corresponde.
    private static int searchInRotatedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) { return mid; }
            if(arr[mid] >= arr[low]) {
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            }else{
                if(target <= arr[high] && target < arr[mid]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
