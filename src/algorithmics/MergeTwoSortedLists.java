package algorithmics;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,0,0,0,0};
        int[] list2 = {-4,2,3,9};
        int[] mergedArray = joinArrays(list1, list2);
        sort(mergedArray);
        for (int j : mergedArray) {
            System.out.println(j);
        }
    }

    static int[] joinArrays(int[] list1, int[] list2) {
        int lengthArray = (list1.length - list2.length) + list2.length;
        int[] mergedArray = new int[lengthArray];
        int limit = list1.length - list2.length;
        for (int i = limit, j = 0; i <= lengthArray -1; i++, j++) {
            list1[i] = list2[j];
        }
        mergedArray = list1;
        return mergedArray;
    }

    static void sort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left_half = new int[mid];
        int[] right_half = new int[arr.length - mid];

        // copying the elements of array into left_half
        for (int i = 0; i < mid; i++) {
            left_half[i] = arr[i];
        }

        // copying the elements of array into right_half
        for (int i = mid; i < arr.length; i++) {
            right_half[i - mid] = arr[i];
        }

        sort(left_half);
        sort(right_half);
        merge(arr, left_half, right_half);
    }

    static void merge(int[] arr, int[] left_half, int[] right_half) {
        int i = 0, j = 0, k = 0;

        while (i < left_half.length && j < right_half.length) {
            if (left_half[i] < right_half[j]) {
                arr[k++] = left_half[i++];
            }
            else {
                arr[k++] = right_half[j++];
            }
        }
        while (i < left_half.length) {
            arr[k++] = left_half[i++];
        }
        while (j < right_half.length) {
            arr[k++] = right_half[j++];
        }
    }
}
