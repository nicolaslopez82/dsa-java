package Algorithmics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * En una lengua alienígena también utilizan las letras del español, pero posiblemente en un orden diferente.
 * Es una permutación de nuestro alfabeto.
 *
 * Tu desafío es, dada una secuencia de palabras escritas en el idioma extranjero y el orden del alfabeto alienígena,
 * devolver verdadero si y solo si las palabras dadas están ordenadas lexicográficamente según el orden de letras
 * del alfabeto alienígena dado.
 *
 * // Input
 * const words1 = ["habito", "hacer", "lectura", "sonreir"];
 * const order1 = "hlabcdfgijkmnopqrstuvwxyz";
 * isAlienSorted(words1, order1);
 *
 * // Output
 * true
 *
 * Ejemplo 2:
 *
 * // Input 1
 * const words2 = ["habito", "hacer", "sonreir", "lectura"];
 * const order2 = "hlabcdfgijkmnopqrstuvwxyz";
 * isAlienSorted(words2, order2);
 *
 * // Output 2
 * false
 *
 * Ejemplo 3:
 *
 * // Input
 * const words3 = ["conocer", "cono"];
 * const order3 = "abcdefghijkmnopqrstuvwxyz";
 * isAlienSorted(words3, order3);
 *
 * // Output:
 * false
 */
public class VerifyingAlienDictionary {
    public static void main(String[] args) {
        String[] words1 = {"habito", "hacer", "lectura", "sonreir"};
        String order1 = "hlabcdfgijkmnopqrstuvwxyz";

        String[] words2 = {"habito", "hacer", "sonreir", "lectura"};
        String order2 = "hlabcdfgijkmnopqrstuvwxyz";

        String[] words3 = {"conocer", "cono"};
        String order3 = "abcdefghijkmnopqrstuvwxyz";

        System.out.println("isAlienSorted: " + isAlienSorted(words1, order1));
        System.out.println("============");
        System.out.println("isAlienSorted: " + isAlienSorted(words2, order2));
        System.out.println("============");
        System.out.println("isAlienSorted: " + isAlienSorted(words3, order3));
    }

    private static boolean isAlienSorted(String[] words, String order) {
        char[] charArray = order.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], i);
        }

        for (int i = 0; i+1 < words.length; i++) {
            char[] wordLeft = words[i].toCharArray();
            char[] wordRight = words[i+1].toCharArray();

            int lengthWordLeft = wordLeft.length;
            int lengthWordRight = wordRight.length;
            int min = Math.min(lengthWordLeft, lengthWordRight);
            boolean flag = false;

            for(int j = 0; j < min; j++){
                int charLeft = map.get(wordLeft[j]);
                int charRight = map.get(wordRight[j]);
                if(charLeft != charRight){
                    flag = true;
                    if(map.get(wordLeft[j]) > map.get(wordRight[j])){
                        return false;
                    }else if(map.get(wordLeft[j]) < map.get(wordRight[j])){
                        break;
                    }else if(lengthWordLeft > lengthWordRight){return false;}
                }
            }
            if(!flag){
                return !(lengthWordLeft > lengthWordRight);
            }
        }
        return true;
    }
}
