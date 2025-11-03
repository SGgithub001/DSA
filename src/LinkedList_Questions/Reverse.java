package LinkedList_Questions;

import java.util.Scanner;

public class Reverse {
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
        public ListNode reverse(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse reverseObj = new Reverse();
        ListNode head = null, temp = null;
        System.out.println("Enter number of nodes in the list:");
        int n = sc.nextInt();
        if (n > 0) {
            head = reverseObj.new ListNode(sc.nextInt());
            temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = reverseObj.new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }
        // Reverse the linked list
        ListNode reversedHead = reverseObj.new ListNode().reverse(head);
        System.out.println("Reversed linked list:");
        temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        sc.close();
    }
}
