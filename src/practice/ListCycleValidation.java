package practice;

public class ListCycleValidation {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
        //Uncomment to make a List Cycle. Pointing to Node(4);
        //head.next.next.next.next.next.next.next.next.next = head.next.next.next;

        System.out.println("List Cycle Validation --> " + listCycleValidation(head));
    }

    public static boolean listCycleValidation(Node head) {
        if (head == null) { return false; } //If head is null, I don't have anything to validate.

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
