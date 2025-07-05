package practice;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseLinkedList(head);

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }

        Node next = null;
        Node prev = null;
        Node curr = head;

        while (curr != null) {

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        // Return the head of reversed linked list
        head = prev;
        return head;
    }
}
