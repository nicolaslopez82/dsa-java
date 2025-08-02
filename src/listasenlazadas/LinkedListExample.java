package listasenlazadas;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create individual nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // Link the nodes together
        node1.next = node2; // node1 points to node2
        node2.next = node3; // node2 points to node3
        // node3.next remains null by default (or explicitly set to null)

        // The 'head' of the list is the first node
        Node head = node1;

        // Traverse and print the list
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }
}
