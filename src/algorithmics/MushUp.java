package algorithmics;

public class MushUp {

    public static void main(String[] args) {
        //System.out.println(algoritmo("Compass", "password"));
        System.out.println(algoritmo("CompassP", "Password"));
    }

    static String mushUp(String str1, String str2) {

        if(str1.isEmpty() || str2.isEmpty()){return "";}

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        char[] mushUp = new char[str1.length() + str2.length()];
        int indexFinalChar = 0;

        for(int i = 0; i < str1.length(); i++){
            for(int j = 0; j < str2.length(); j++){
                if(char1[i] == char2[j]){
                    mushUp[indexFinalChar] = char1[i];
                    indexFinalChar++;
                }
            }
        }

        String strMushUp = String.valueOf(mushUp);
        return strMushUp+str2;
    /*    for(int i=0; i < mushUp.length; i++){
                    if (mushUp[i] != ' '){
                        finalStringBuffer.append(mushUp[i]);
                    }
        }*/

       // finalStringBuffer.append(str2);
        /*for(int i=0; i < str2.length(); i++){
            if (char2[i] != ' '){
                finalStringBuffer.append(char2[i]);
            }
        }*/


       // return finalStringBuffer.toString();
    }

    public static String algoritmo(String str1, String str2){

        boolean continueLooking = true;
        boolean wasMatch = false;
        String matched = new String();

        for(int i = 0; i < (str1.length() - 1); i++){
            String subStr = str1.substring(i);
            if(str2.contains(subStr)){
                if(str2.charAt(0) == subStr.charAt(0)){
                    matched = subStr;
                    wasMatch = true;
                }
                continueLooking = false;
            }
            if(continueLooking == false){
                break;
            }
        }

        if(!wasMatch){
            return "nothing";
        }else{
            return matched + str2;
        }
    }
}
