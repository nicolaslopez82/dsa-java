package algorithmics;

public class ReverseLinkedList {

    /**
    Explanation: https://www.geeksforgeeks.org/dsa/reverse-a-linked-list/
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
