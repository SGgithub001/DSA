package LinkedList_Questions;
import java.util.Scanner;

public class PairWiseSwap {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode Swap(ListNode head){
        ListNode first = head;
        ListNode prev = null;
        while(first != null && first.next != null){
            ListNode second = first.next;
             first.next =second.next;
             second.next = first;
            if(prev == null){
                head = second;
            }else{
                prev.next = second;
            }
            prev = first;
            first = first.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();
        if (n == 0){
            return;
        }
        PairWiseSwap swapper = new PairWiseSwap();
        PairWiseSwap.ListNode head = swapper.new ListNode(sc.nextInt());
        PairWiseSwap.ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = swapper.new ListNode(sc.nextInt());
            current = current.next;
        }
        head = swapper.Swap(head);
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        sc.close();
    }

}
