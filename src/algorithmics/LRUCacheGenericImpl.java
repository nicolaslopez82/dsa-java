package algorithmics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheGenericImpl <T> {
    private Map<Integer,T> cache = new HashMap<>();
    private LinkedList<Integer> order = new LinkedList<>();
    private int capacity;

    public LRUCacheGenericImpl(int capacity) {
        this.capacity = capacity;
    }
    public T get(int key) {

        T value = cache.get(key);

        if (value != null) {
            order.remove((Object) key);
            order.addFirst(key);
            return value;
        }else {
            value = null;
        }
        return value;
    }

    public void put(int key, T value) {
        //check the order capacity
        if(order.size() >= capacity){
            //remove the item less used in the order list.
            int keyRemoved = order.removeLast();
            order.remove(keyRemoved);
        }
        //add the new item to the top order list.
        order.addFirst(key);
        //put the key and value to the cache map.
        cache.put(key, value);
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            int key = order.get(i);
            System.out.println("key: " + key + " value: " + cache.get(key));
        }
    }

    public static void main(String[] args) {
        LRUCacheGenericImpl lruCacheGeneric =  new LRUCacheGenericImpl(5);

        lruCacheGeneric.put(1, "one");
        lruCacheGeneric.put(2, "two");
        lruCacheGeneric.put(3, "three");
        lruCacheGeneric.put(4, "four"); // putting new cache when full. 1 will be removed
        lruCacheGeneric.get(3); // accessing 3, it will be moved to top
        lruCacheGeneric.get(2);// accessing 2, it will be moved to top
        lruCacheGeneric.put(1, "one"); // putting new cache when full. 4 will be removed
        lruCacheGeneric.get(3);// accessing 3, it will be moved to top
        lruCacheGeneric.get(1);// accessing 1, it will be moved to top

        /*lruCacheGeneric.put(1, 1);
        lruCacheGeneric.put(2, 2);
        lruCacheGeneric.put(3, 3);
        lruCacheGeneric.put(4, 4);
        lruCacheGeneric.put(5, 5);
        lruCacheGeneric.put(6, 6);
        lruCacheGeneric.put(7, 7);

        lruCacheGeneric.get(3);
        lruCacheGeneric.get(5);
        lruCacheGeneric.get(6);
        lruCacheGeneric.get(5);*/

        lruCacheGeneric.display();
    }

}
