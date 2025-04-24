package Algorithmics;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        String s = "Geeks";
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {

            // extracts each character
            ch = s.charAt(i);

            // adds each character in
            // front of the existing string
            r = ch + r;
        }

        List<String> list = new ArrayList<>();
        list.add("Falcon");
        list.add("Tomahawk");
        list.add("Phantom");
        list.add("Horne");
        list.add("Greyhound");

        System.out.println("========= List =============" + '\n');
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("Falcon");
        queue.add("Tomahawk");
        queue.add("Phantom");
        queue.add("Greyhound");

        System.out.println("========= Queue =============" + '\n');

        int queueLength = queue.size();
        for (int i = 0; i < queueLength; i++) {
            System.out.println(queue.poll());
        }


        Stack<String> stack = new Stack<>();

        stack.push("Falcon");
        stack.push("Tomahawk");
        stack.push("Phantom");
        stack.push("Greyhound");

        System.out.println("========= Stack =============" + '\n');

        int stackLength = stack.size();
        for (int i = 0; i < stackLength; i++) {
            System.out.println(stack.pop());
        }



        //System.out.println(r);
    }
}
