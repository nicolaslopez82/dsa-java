package algorithmics;

/**
 *
 * Given a singly linked list L0 -> L1 -> … -> Ln-1 -> Ln. Rearrange the nodes in the list so that the newly formed
 * list is : L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 ... You are required to do this in place without altering the nodes'
 * values.
 *
 * Examples:
 *
 * Input:  1 -> 2 -> 3 -> 4
 * Output: 1 -> 4 -> 2 -> 3
 * Explanation: Here n = 4, so the correct order is L0->L3->L1->L2
 *
 * Input:  1 -> 2 -> 3 -> 4 -> 5
 * Output: 1 -> 5 -> 2 -> 4 -> 3
 * Explanation: Here n = 4, so the correct order is L0->L4->L1->L3->L2
 */

/**
 * [Efficient Approach] By Reversing Second Half - O(n) Time and O(1) Space
 *
 * Find the middle of the linked list using the fast and slow pointer method.
 * Reverse the second half of the list starting just after the middle node and split them in two parts.
 * Merge the two halves together by alternating nodes from the first half with nodes from the reversed second half.
 */

public class ReorderList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(reorderList(head));
    }

    public static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Handle empty or single-node lists
        }

        // Step 1: Find the middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split the list
        ListNode secondHalf = slow.next;
        slow.next = null; // Disconnect the first half

        // Step 3: Reverse the second half
        ListNode prev = null;
        ListNode curr = secondHalf;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        secondHalf = prev; // 'prev' is now the head of the reversed second half

        // Step 4: Merge alternately
        ListNode firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
        return head;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
}
