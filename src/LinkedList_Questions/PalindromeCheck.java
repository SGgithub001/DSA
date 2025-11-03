package LinkedList_Questions;
import java.util.Scanner;
public class PalindromeCheck {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            ListNode slow = head;
            ListNode fast = head;
            ListNode newListHead = null;
            while (fast != null && fast.next != null) {
                ListNode nextSlow = slow.next;
                fast = fast.next.next;

                ListNode node = new ListNode(slow.val);
                node.next = newListHead;
                newListHead = node;

                slow = nextSlow;
            }
            if (fast != null) {
                slow = slow.next;
            }
            while (slow != null) {
                if (slow.val != newListHead.val) return false;
                slow = slow.next;
                newListHead = newListHead.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeCheck pc = new PalindromeCheck();
        ListNode head = null, temp = null;
        System.out.println("Enter number of nodes in the linked list:");
        int n = sc.nextInt();
        if (n > 0) {
            head = pc.new ListNode(sc.nextInt());
            temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = pc.new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }
        boolean result = pc.new ListNode().isPalindrome(head);
        if (result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
        sc.close();
    }
}
