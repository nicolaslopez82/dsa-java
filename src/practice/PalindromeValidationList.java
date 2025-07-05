package practice;

public class PalindromeValidationList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(1);

        /*Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(1);*/

        System.out.println(validatePalindrome(head));
    }

    public static boolean validatePalindrome(Node head) {
        if (head == null || head.next == null) { return false; }//If head is null, I don't have anything to validate.

        Node headBackUp = head;
        Node mid = findMid(head);

        Node reversedHeadList = reverseHalfRightList(mid);

        while (headBackUp != mid.next) {
            if (headBackUp.data != reversedHeadList.data) {
                return false;
            }
            headBackUp = headBackUp.next;
            reversedHeadList = reversedHeadList.next;
        }
        return true;
    }

    public static Node reverseHalfRightList(Node head) {
        if (head == null || head.next == null) { return head; }
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
