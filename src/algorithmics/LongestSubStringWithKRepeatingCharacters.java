package algorithmics;

/**
 * # Entrada:
 * 	s = "AABABBA", k = 1
 * # Salida:
 * 	4
 */

public class LongestSubStringWithKRepeatingCharacters {
    public static void main(String[] args) {
        String text = "AABABBA";
        int k = 1;

        System.out.println("lengthOfLongestSubstring: " + lengthOfLongestSubstring(text, k));
    }

    public static int lengthOfLongestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int pLeft = 0;
        int counter = 0;
        int kCounter = 0;
        int result = 0;

        for (int pRight = 0; pRight < chars.length; pRight++) {
            if ( chars[pRight] == 'A'){
                /*if(kCounter < k){
                    counter++;
                }*/
                counter++;
                result = Math.max(result, counter);
            }else {

                pLeft = pRight;

                while (kCounter < k && chars[pRight] != 'A'){
                    chars[pLeft] = 'A';
                    kCounter++;
                    pRight++;
                    pLeft++;
                    counter++;
                }
            }
            result = Math.max(result, counter);
        }
        return result;
    }
}
