package algorithmics;

/**
 * Dada una cuadrícula m x n y una cadena palabra, devuelve true si esta existe en la cuadrícula.
 *
 * La palabra puede construirse a partir de letras de celdas secuencialmente adyacentes, donde las celdas adyacentes
 * son vecinas horizontal o verticalmente.
 *
 * Una misma celda de letra no pude ser utilizada más de una vez.
 *
 * Ejemplo:
 *
 * // Input
 * const board = [
 *   ["A", "B", "C", "E"],
 *   ["S", "F", "C", "S"],
 *   ["A", "D", "E", "E"],
 * ];
 * const word = "ABCCED";
 * wordExist(board, word);
 *
 * // Output
 * true
 *
 * Ejemplo 2:
 *
 * // Input
 * const board = [
 *   ["A", "M", "C", "E"],
 *   ["A", "M", "C", "E"],
 *   ["A", "M", "C", "E"],
 * ];
 * const word = "AMA";
 * wordExist(board, word);
 *
 * // Output
 * false
 */

public class WordSearch {

    public static void main(String[] args) {
        char [][] board = {{'A', 'B', 'C', 'E'},
                           {'S', 'F', 'C', 'S'},
                           {'A', 'D', 'E', 'E'}};

        /*char [][] board = {{'A', 'M', 'C', 'E'},
                           {'A', 'M', 'C', 'E'},
                           {'A', 'M', 'C', 'E'}};*/

        String word = "ABCCED";
        //String word = "AMA";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {

        int totalRows = board.length;
        int totalCols = board[0].length;
        int index = 0;
        boolean exist = false;

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if( board[i][j] == word.charAt(index)){
                    //Start DFS Recursion.
                    exist = DFSRecursion(board, word, index, i, j, exist);
                    return  exist;
                }
            }
        }
        return exist;
    }

    public static boolean DFSRecursion(char[][] board, String word, int index, int row, int col, boolean exist) {
        int totalRows = board.length;
        int totalCols = board[0].length;

        if(isSafe(row, col, totalRows, totalCols)){
            if(board[row][col] != word.charAt(index)){
                return false;
            }
        }else {return false;}

        board[row][col] = '#';

        //End of Matrix and find.
        if(index == word.length() - 1) {
            exist = true;
            return  exist;
        }

        //exist = true;
        index++;
        DFSRecursion(board, word, index, row + 1, col, exist);
        DFSRecursion(board, word, index, row, col + 1, exist);
        DFSRecursion(board, word, index, row, col - 1, exist);
        DFSRecursion(board, word, index, row - 1, col, exist);

        board[row][col] = word.charAt(index-1); //Backtracking.

        return exist;
    }

    public static boolean isSafe(int row, int col, int totalRows, int totalCols) {
        return (row >= 0 && row < totalRows && col >= 0 && col < totalCols);
    }
}
