package algorithmics;

/**
 * Validar palíndromo (con k reemplazos)
 * Dada una cadena de caracteres, averigua si la cadena dada es un palíndromo o no. Puedes eliminar un carácter de la cadena. Una cadena es un palíndromo si se lee igual hacia adelante y hacia atrás.
 *
 * Ejemplo 1:
 *
 *
 * # Entrada:
 * 	s = "aba"
 * # Salida:
 * 	true
 * Ejemplo 2:
 *
 *
 * # Entrada:
 * 	s = "abca"
 * # Salida:
 * 	true
 *
 * #Explicación: Podría eliminar el carácter 'c'.
 */

public class ValidatePalidome {

    public static void main(String[] args) {
        //Convert String to char []
        String str = "neuquen";
        char[] chars = str.toCharArray();

        int pLeft = 0;
        int pRight = chars.length - 1;
        boolean isPalindrome = true;

        while (pLeft < pRight) {
            if (chars[pLeft] != chars[pRight]) {
                isPalindrome = false;
                break;
            }
            pLeft++;
            pRight--;
        }

        System.out.println("isPalindrome: " + isPalindrome);
    }

}
