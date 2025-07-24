    package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a matrix of dimension mxn, where each cell in the matrix can have values 0, 1 or 2
 * which has the following meaning:
 *
 * 0: Empty cell
 * 1: Cells have fresh oranges
 * 2: Cells have rotten oranges
 * The task is to find the minimum time required so that all the oranges become rotten.
 * A rotten orange at index (i,j) can rot other fresh oranges which are its neighbors (up, down, left, and right).
 *
 * Note : If it is impossible to rot every orange then simply return -1.
 *
 * Examples:
 *
 * Input:  arr[][] = [[2, 1, 0, 2, 1], [1, 0, 1, 2, 1], [1, 0, 0, 2, 1]];
 * Output: 2
 * Explanation: At 0th time frame:
 * [2, 1, 0, 2, 1]
 * [1, 0, 1, 2, 1]
 * [1, 0, 0, 2, 1]
 * At 1st time frame:
 * [2, 2, 0, 2, 2]
 * [2, 0, 2, 2, 2]
 * [1, 0, 0, 2, 2]
 * At 2nd time frame:
 * [2, 2, 0, 2, 2]
 * [2, 0, 2, 2, 2]
 * [2, 0, 0, 2, 2]
 *
 * Input:  arr[][] = [[2, 1, 0, 2, 1], [0, 0, 1, 2, 1], [1, 0, 0, 2, 1]]
 * Output: -1
 * Explanation: At 0th time frame:
 * [2, 1, 0, 2, 1]
 * [0, 0, 1, 2, 1]
 * [1, 0, 0, 2, 1]
 * At 1st time frame:
 * [2, 2, 0, 2, 2]
 * [0, 0, 2, 2, 2]
 * [1, 0, 0, 2, 2]
 * At 2nd time frame:
 * [2, 2, 0, 2, 2]
 * [0, 0, 2, 2, 2]
 * [1, 0, 0, 2, 2]
 * The 1 at the bottom left corner of the matrix is never rotten.
 */

public class RottingOrangesBFS {

    public static void main(String[] args)
    {
        int[][] arr = {{2, 1, 0, 2, 1},
                       {1, 0, 1, 2, 1} ,
                       {1, 0, 0, 2, 1}};
        System.out.println(rottingOrange(arr));
    }

    /**
     * Check if i, j is within the array
     * limits of row and column.
     * @param i
     * @param j
     * @param n
     * @param m
     * @return
     */
    public static boolean isSafe(int i, int j, int n, int m){
        return (i >= 0 && i < n && j >= 0 && j < m);
    }

    public static int rottingOrange(int[][] arr) {

        int rows = arr.length;
        int colums = arr[0].length;

        // counter of elapsed time
        int elapseTime = 0;


        // all four directions
        int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

        // Enqueue all rotten oranges.
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                if(arr[i][j] == 2){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()){

            //Increment the elapseTime in 1.
            elapseTime++;

            // Useful to save the elapseTime properly.
            // First time, take the original rotten oranges, second time is going to take the new ones oranges that
            // have been rotten, and they have been added on the line: queue.add(new Integer[]{newX, newY});
            int queueSize = queue.size();

            while(queueSize-- > 0){
                int [] position = queue.poll();
                int x = position[0];
                int y = position[1];

                // change 4-directionally connected cells.
                for(int [] direction : directions){
                    int newX = x + direction[0];
                    int newY = y + direction[1];

                    // Check if the cell is in the matrix and the orange is fresh.
                    if(isSafe(newX, newY, rows, colums)){
                        if(arr[newX][newY] == 1){
                            arr[newX][newY] = 2;
                            queue.add(new int[]{newX, newY});
                        }
                    }
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                if(arr[i][j] == 1){
                    return -1;
                }
            }
        }
        return Math.max(0, elapseTime -1);
    }
}
