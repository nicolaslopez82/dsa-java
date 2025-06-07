package practice;

/**
 * Dada una cadena s y un número entero k. Devuelve la longitud de la subcadena más larga que contenga la misma letra
 * de forma consecutiva. Donde puedes cambiar k caracteres de la cadena por otro caracter.
 *
 * Ejemplo 1:
 * # Entrada:
 * 	s = "ABAB", k = 2
 * # Salida:
 * 	4
 * 	Explicación: Sustituir las dos "A" por dos "B" o viceversa.
 *
 * 	Ejemplo 2:
 * 	# Entrada:
 * 	s = "AABABBA", k = 1
 * # Salida:
 * 	4
 * 	Explicación: Se sustituye la 'A' del medio por la 'B' y se forma "AABBBBA". La subcadena "BBBB" tiene las letras
 * 	repetidas más largas, que son 4.
 *
 *
 */

public class SubcadenaMasLargaSinCaracteresRepetidos {

    public static void main(String[] args) {
        //String s = "ABAB";
        String s = "AABABBA";
        int k = 1;

        System.out.println(subcadenaMasLargaSinCaracteresRepetidos(s, k));
    }

    public static int subcadenaMasLargaSinCaracteresRepetidos(String s, int k) {

        char[] cs = s.toCharArray();
        int pLeft = 0, bCount = 0;
        int res = 0;

        for (int pRight = 0; pRight < cs.length; pRight++) {
            if (cs[pRight] == 'B') {
                bCount++;
            }

            while (bCount > k) {
                if (cs[pLeft] == 'A') {
                    bCount--;
                    pLeft++;
                }
            }
            res = Math.max(res, pRight - pLeft);
        }
        return res;
    }

}
