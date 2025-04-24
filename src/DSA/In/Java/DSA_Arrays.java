package DSA.In.Java;

import java.util.Arrays;
import java.util.Iterator;

public class DSA_Arrays {
    int [] arr = {1,2,3,4,5};

    public static void main(String[] args) {
        DSA_Arrays obj = new DSA_Arrays();
        Iterator<Integer> iterator = Arrays.stream(obj.arr).iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


