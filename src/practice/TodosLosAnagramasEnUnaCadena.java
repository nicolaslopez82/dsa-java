package practice;

import java.util.*;

/**
 * 4. Encontrar todos los anagramas de una cadena
 * Dadas dos cadenas s y p, devuelva un arreglo con todos los índices de inicio de los anagramas de p en s. Puede devolver la respuesta en cualquier orden.
 *
 * Un anagrama es una palabra o frase que se forma reordenando las letras de otra palabra o frase, normalmente utilizando todas las letras originales exactamente una vez.
 *
 * Ejemplo 1:
 *
 *
 * # Entrada:
 * 	s = "cbaebabacd", p = "abc"
 * # Salida:
 * 	[0,6]
 * Explicación: La subcadena con índice inicial = 0 es "cba", que es un anagrama de "abc". La subcadena con índice inicial = 6 es "bac", que es un anagrama de "abc".
 *
 * Ejemplo 2:
 *
 *
 * # Entrada:
 * 	s = "abab", p = "ab"
 * # Salida:
 * 	[0,1,2]
 * Explicación: La subcadena con índice inicial = 0 es "ab", que es un anagrama de "ab". La subcadena con índice inicial = 1 es "ba", que es un anagrama de "ab". La subcadena con índice inicial = 2 es "ab", que es un anagrama de "ab".
 */

public class TodosLosAnagramasEnUnaCadena {

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(solve(s,p));
    }

    public static List<Integer> solve(String s, String p){
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return ans;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // The number of distinct characters
        int counter = map.size();
        for (int left = 0, right = 0; right < s.length(); right++) {
            char cRight = s.charAt(right);
            if (map.containsKey(cRight)) {
                map.put(cRight, map.get(cRight) - 1);
                if (map.get(cRight) == 0) {
                    counter -= 1;
                }
            }

            while (counter <= 0) {
                char cLeft = s.charAt(left);
                if (map.containsKey(cLeft)) {
                    map.put(cLeft, map.get(cLeft) + 1);
                    if (map.get(cLeft) > 0) {
                        counter += 1;
                    }
                }
                if (right - left + 1 == p.length()) {
                    ans.add(left);
                }
                left++;
            }
        }

        return ans;
    }
}
