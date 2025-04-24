package DSA.In.Java;

public class DSA_LinkedList {

    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;

        System.out.println(node1.data);
        System.out.println(node2.data);
        System.out.println(node1.next.data);
    }
}

