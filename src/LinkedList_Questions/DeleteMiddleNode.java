package LinkedList_Questions;

public class DeleteMiddleNode {
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

    public ListNode deleteMiddle(ListNode head){
        if(head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Deleted node: " + slow.val);
        if(prev == null){
            head = head.next;
        }else{
            prev.next = slow.next;
            slow.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        DeleteMiddleNode list = new DeleteMiddleNode();
        DeleteMiddleNode.ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);
        head.next.next.next.next = list.new ListNode(5);
        head = list.deleteMiddle(head);
        DeleteMiddleNode.ListNode curr = head;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
