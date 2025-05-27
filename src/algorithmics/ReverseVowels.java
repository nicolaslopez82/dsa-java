package algorithmics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Dada una cadena de caracteres, invierte solo todas las vocales de la cadena. Las vocales son 'a', 'e', 'i', 'o' y 'u', 'A', 'E', 'I', 'O', 'U'.
 *
 * Ejemplo 1:
 * # Entrada:
 * 	s = "hola"
 * # Salida:
 * 	"halo"
 *
 * Ejemplo 2:
 * 	# Entrada:
 * 	s = s = "leetcode"
 * # Salida:
 * 	"leotcede"
 */

public class ReverseVowels {

    public static void main(String[] args) {
        //Create a Set to save all vowels to compare. Set -> Quick contains method working with hash instead of List. The contains() of HashSet runs in O(1) time.
        Set<Character> vowels = new HashSet<Character>();
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String str = "leetcode";
        //Convert String to Char [].
        char[] chars = str.toCharArray();
        for (int i = 0; i < vowelsArray.length; i++) {
            vowels.add(vowelsArray[i]);
        }

        //Create 2 pointers. pLeft = 0 & pRight = String.length()-1
        int pLeft = 0;
        int pRight = chars.length - 1;

        //Iterate always that pLeft < pRight.
        while (pLeft < pRight) {
            //Compare if str[pLeft] is a vowel or not with the set.
            if (vowels.contains(chars[pLeft])) {
                // Yes -> Stop the pLeft there and get the vowel.
                char cLeft = chars[pLeft];

                //Compare if str[pRight] is a vowel or not with the set.
                if(vowels.contains(chars[pRight])) {
                    //Yes -> Stop the pRight there and get the vowel.
                    char cRight = chars[pRight];
                    //SwapVowels(str[pLeft], str[pRight]);
                    reverseVowels(chars, pLeft, pRight);

                    //pLeft++; pRight--;
                    pLeft++;
                    pRight--;
                }else {
                    //No -> pRight--;
                    pRight--;
                }
            }else {
                // No -> pLeft++;
                pLeft++;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    public static void reverseVowels(char [] cArray, int start, int end) {
        char temp;
        temp = cArray[start];
        cArray[start] = cArray[end];
        cArray[end] = temp;
    }
}
