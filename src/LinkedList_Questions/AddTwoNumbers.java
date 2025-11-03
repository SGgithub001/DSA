package LinkedList_Questions;

import java.util.Scanner;

public class AddTwoNumbers {
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
        public ListNode Add(ListNode l1, ListNode l2) {
            ListNode head = null;
            ListNode temp = null;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int val1 = (l1 == null) ? 0 : l1.val;
                int val2 = (l2 == null) ? 0 : l2.val;
                int sum = val1 + val2 + carry;
                ListNode newNode = new ListNode(sum % 10);
                carry = sum / 10;
                if (head == null) {
                    head = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = temp.next;
                }
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            return head;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = null, l2 = null, temp = null;
        System.out.println("Enter number of nodes for first list:");
        int n1 = sc.nextInt();
        if (n1 > 0) {
            l1 = atn.new ListNode(sc.nextInt());
            temp = l1;
            for (int i = 1; i < n1; i++) {
                temp.next = atn.new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }
        System.out.println("Enter number of nodes for second list:");
        int n2 = sc.nextInt();
        if (n2 > 0) {
            l2 = atn.new ListNode(sc.nextInt());
            temp = l2;
            for (int i = 1; i < n2; i++) {
                temp.next = atn.new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }
        ListNode result = atn.new ListNode().Add(l1, l2);
        System.out.println("Resultant list after addition:");
        temp = result;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        sc.close();
    }
}
