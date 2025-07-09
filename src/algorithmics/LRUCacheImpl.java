package algorithmics;

import java.util.*;

public class LRUCacheImpl {
    private static int capacity;
    private static Map<Integer,String> cache = new  HashMap<>();
    private static LinkedList<Integer> order =  new LinkedList<>();

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
    }

    public static String get(int key) {

        String value = cache.get(key);

        if (value != null) {
            order.remove((Object)key);
            order.addFirst(key);
        }else {
            value = null;
        }
        return value;
    }

    public static void put(int key, String value) {

        //check the order capacity
        if(order.size() >= capacity){
            //remove the item less used in the order list.
            int keyRemoved = order.removeLast();
            cache.remove(keyRemoved);
        }

        //add the new item to the top order list.
        order.addFirst(key);
        //put the key and value to the cache map.
        cache.put(key,value);
    }


    public static void display() {
        System.out.println(" Order values: ");
        order.forEach(System.out::println);

        System.out.println(" Cache values: ");
        cache.forEach((integer, s) ->  System.out.println(s));

        System.out.println(" Output: ");
        for(int i = 0; i < order.size(); i++){
            int key = order.get(i);
            String value = cache.get(key);
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        LRUCacheImpl cache = new LRUCacheImpl(3);
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        cache.put(4, "four"); // putting new cache when full. 1 will be removed
        cache.get(3); // accessing 3, it will be moved to top
        cache.get(2);// accessing 2, it will be moved to top
        cache.put(1, "one"); // putting new cache when full. 4 will be removed
        cache.get(3);// accessing 3, it will be moved to top
        cache.get(1);// accessing 1, it will be moved to top
        cache.display(); // 1 should be on top
    }
}
