package LinkedList_Questions;

public class MiddleOfLinkedList {
    public class listNode{
        int val;
        listNode next;
        listNode(){}
        listNode(int val){
            this.val = val;
        }
        listNode(int val, listNode next){
            this.val = val;
            this.next = next;
        }
    }
    public listNode middle(listNode head){
        listNode fast = head;
        listNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        MiddleOfLinkedList.listNode head = list.new listNode(1);
        head.next = list.new listNode(2);
        head.next.next = list.new listNode(3);
        head.next.next.next = list.new listNode(4);
        head.next.next.next.next = list.new listNode(5);

        MiddleOfLinkedList.listNode middle = list.middle(head);
        System.out.println("Middle Node: " + middle.val);
    }
}

