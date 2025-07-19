package practice;

/**
 * Una imagen está representada por una cuadrícula de enteros m x n donde image[i][j] representa el valor de los píxeles
 * de la imagen. También se le dan tres enteros sr, sc y color. Debe realizar un relleno en la imagen comenzando
 * por el píxel image[sr][sc].
 *
 * Para realizar un relleno, considere el píxel inicial, más cualquier píxel conectado en 4 direcciones al píxel inicial
 * del mismo color que el píxel inicial, más cualquier píxel conectado en 4 direcciones a esos píxeles
 * (también con el mismo color), y así sucesivamente. Reemplazar el color de todos los píxeles mencionados por el color.
 *
 * Devuelve la imagen modificada después de realizar el relleno.
 *
 * Ejemplo 1: Entrada: imagen = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2 Salida: [[2,2,2],[2,2,0],[2,0,1]]
 * Explicación: Desde el centro de la imagen con posición (sr, sc) = (1, 1) (es decir, el píxel rojo),
 * todos los píxeles conectados por un camino del mismo color que el píxel inicial (es decir, los píxeles azules)
 * se colorean con el nuevo color. Observe que la esquina inferior no se colorea con el color 2,
 * porque no está conectada en 4 direcciones al píxel inicial.
 *
 * Ejemplo 2: Entrada: imagen = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0 Salida: [[0,0,0],[0,0,0]]
 * Explicación: El píxel inicial ya tiene el color 0, por lo que no se realizan cambios en la imagen.
 */


public class ReplaceColorInASectionImage {

    public static void main(String[] args) {
        int [][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        //int [][] image = {{0,0,0}, {0,0,0}, {0,0,0}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        replaceColorInASectionImage(image, sr, sc, color);
        displayImage(image);
    }

    public static void replaceColorInASectionImage(int[][] image, int sr, int sc, int color) {
        int imageTotalRows = image.length;
        int imageTotalColumns = image[0].length;

        if (sr >= imageTotalRows || sc >= imageTotalColumns || sr < 0 || sc < 0 || image[sr][sc] == color) {
            return;
        }

        if (image[sr][sc] != 0){
            image[sr][sc] = color;
            replaceColorInASectionImage(image, sr + 1, sc, color);
            replaceColorInASectionImage(image, sr - 1, sc, color);
            replaceColorInASectionImage(image, sr, sc + 1, color);
            replaceColorInASectionImage(image, sr, sc - 1, color);
        }
    }

    public static void displayImage(int[][] image) {
        for(int row = 0; row < image.length; row++){
            System.out.println('\n');
            for(int col = 0; col < image[row].length; col++){
                System.out.print(image[row][col] + " ");
            }
        }
    }
}
