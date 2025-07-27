package algorithmics;

public class WordSearch {

    public static void main(String[] args) {
        char[][] mat = {{'a', 'x', 'k', 't'},
                        {'w', 'm', 'd', 'r'},
                        {'x', 'a', 't', 'k'},
                        {'d', 'a', 'e', 'o'}};
        String word = "mateo";
        System.out.println(isWordExist(mat, word));
    }

    // Function to check if the word exists in the matrix or not
    public static boolean isWordExist(char[][] board, String word) {
        // take limits
        int totalRows = board.length;
        int totalCols = board[0].length;
        // variable to result
        boolean exist = false;
        // check if is safe

        int wIndex = 0;

        // loop to find letter
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                // If first letter matches, then recur and check
                if (board[i][j] == word.charAt(wIndex)) {
                    // DFS to recursion
                   return DFS(board, word, i, j, totalRows, totalCols, wIndex);
                }
            }
        }
        return exist;
    }

    // Function to check if a word exists in a grid
    // starting from the first match in the grid
    // wIndex: index till which pattern is matched
    // row, col: current position in 2D array
    public static boolean DFS(char[][] board, String word, int row, int col, int totalRows, int totalCols, int wIndex) {
        // Out of Boundary
        if(row >= 0 && row < totalRows && col >= 0 && col < totalCols) {
            // If grid doesn't match with a letter while recursion
            if(board[row][col] != word.charAt(wIndex)) {
                return false;
            }

            // Pattern matched
            if(wIndex == word.length() - 1) {
                return true;
            }

            // Marking this cell as visited
            board[row][col] = '#';

            int backUpIndex = wIndex;
            wIndex++;

            // finding subpattern in 4 directions
            boolean result = DFS(board, word, row + 1, col, totalRows, totalCols, wIndex) ||
            DFS(board, word, row - 1, col, totalRows, totalCols, wIndex)  ||
            DFS(board, word, row, col + 1, totalRows, totalCols, wIndex)  ||
            DFS(board, word, row, col - 1, totalRows, totalCols, wIndex);

            // marking this cell as unvisited again - Backtracking.
            board[row][col] = word.charAt(backUpIndex);
            return result;
        }
        return false;
    }
}
