package practice;

/**
 * Given an n x m grid of 'W' (Water) and 'L' (Land), the task is to count the number of islands. An island is a group
 * of adjacent 'L' cells connected horizontally, vertically, or diagonally, and it is surrounded by water or the
 * grid boundary. The goal is to determine how many distinct islands exist in the grid.
 *
 * Examples:
 * Input: grid[][] = [['L', 'L', 'W', 'W', 'W'],
 *                    ['W', 'L', 'W', 'W', 'L'],
 *                    ['L', 'W', 'W', 'L', 'L'],
 *                    ['W', 'W', 'W', 'W', 'W'],
 *                    ['L', 'W', 'L', 'L', 'W']]
 * Output: 4
 * Explanation: The image below shows all the 4 islands in the graph.
 *
 * Input: grid[][] = [['W', 'L', 'L', 'L', 'W', 'W', 'W'],
 *                    ['W', 'W', 'L', 'L', 'W', 'L', 'W']]
 * Output: 2
 * Explanation: The image below shows all the 2 islands in the graph.
 */

public class NumberOfIslands {

    public static void main(String[] args) {
        char grid [][] = {{'L', 'L', 'W', 'W', 'W'},
                         {'W', 'L', 'W', 'W', 'L'},
                         {'L', 'W', 'W', 'L', 'L'},
                         {'W', 'W', 'W', 'W', 'W'},
                         {'L', 'W', 'L', 'L', 'W'}};

        System.out.println(numberOfIsland(grid));
    }

    public static int numberOfIsland(char[][] grid) {
        //Get the total rows in the grid.
        int totalRows = grid.length;
        //Get the total cols in the grid.
        int totalCols = grid[0].length;
        //Create variable counter for islands.
        int numberOfIslands = 0;

        //ForLoop to find the char 'L'
        for (int r = 0; r < totalRows; r++) {
            for (int c = 0; c < totalCols; c++) {
                if (grid[r][c] == 'L') {
                    //Increment number of island variables.
                    numberOfIslands++;
                    //If we get 'L', pass like argument the grid, row, col, totalRows, and totalCols to the explore island method.
                    exploreIsland(grid, r, c);
                }
            }
        }
        return numberOfIslands;
    }

    public static void exploreIsland(char[][] grid, int row, int col) {

        int numRows = grid.length;
        int numCols = grid[0].length;

        //return for the base case that row or col are out of bounded.
        if(row < 0 || row >= numRows || col < 0 || col >= numCols || grid[row][col] == 'W') {
            return;
        }

        //Change the value on the grid[row][col] to 'W' to don't re-count the island.
        grid[row][col] = 'W';

        //Explore with exploreIsland with recursion all sides to change the cell 'L' to 'W'.
        exploreIsland(grid, row - 1, col); //Down
        exploreIsland(grid, row + 1, col); //Up
        exploreIsland(grid, row, col + 1); //Right
        exploreIsland(grid, row, col - 1); //Left

        exploreIsland(grid, row + 1, col - 1); //Up-Left
        exploreIsland(grid, row + 1, col + 1); //Up-Right
        exploreIsland(grid, row - 1, col - 1); //Down-Left
        exploreIsland(grid, row - 1, col + 1); //Down-Right
    }

}
