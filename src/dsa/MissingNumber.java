package dsa;

public class MissingNumber {

    public static int missingNum(int arr[]) {

        int missingNumber = -1;
        int size = arr.length;
        int [] backArr = new int[size + 2];

        // {-1, -1, -1, -1, -1, -1, -1, -1}
        for (int i = 0; i < backArr.length; i++) {
            backArr[i] = -1;
        }

        // {8, 2, 4, 5, 3, 7, 1, -1}
        for (int i = 0; i < size; i++) {
            backArr[arr[i]] = arr[i];
        }

        for (int i = 0; i < backArr.length; i++){
            if(backArr[i] == -1){
                missingNumber = i;
            }
        }
        return missingNumber;
    }

    public static void main(String arg[]){
        //int [] array = {1, 2, 3, 5};
        int [] array = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(array));
    }
}