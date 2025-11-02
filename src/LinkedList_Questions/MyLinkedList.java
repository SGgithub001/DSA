package LinkedList_Questions;

public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.insertTail(10);
        ll.printList();
        ll.insertTail(14);
        ll.printList();
        ll.insertHead(66);
        ll.printList();
        ll.insertNode(23,2);
        ll.printList();
        ll.deleteTail();
        ll.printList();
        ll.deleteHead();
        ll.printList();
        ll.searchNode(10);
        ll.printList();
    }
    Node<Integer> head;
    int size;
    MyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void insertNode(int data, int pos) {
        if(pos > size+1 || pos <= 0){
            System.out.println("Wrong input !!");
            return;
        }
        if(pos == 1){
            insertHead(data);
            return;
        } else if(pos == size+1){
            insertTail(data);
            return;
        } else{
            int counter = 1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while(counter < pos - 1 && temp != null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        System.out.println("Insertion sucessful at position " + pos);
    }

    public void printList(){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println("data s -> " + temp.data);
            temp = temp.next;
        }
    }
    public void insertHead(int data){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            System.out.println("Insertion at head successful");
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion at head successful");
        size++;
    }

    public void insertTail(int data){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            System.out.println("Insertion at tail successful");
            size++;
            return;
        }
        Node<Integer> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Insertion at head successful");
        size++;
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Deletion at tail Successfully");
        size--;
    }

    public void deleteTail(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            System.out.println("Deletion at Tail Successfully");

            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while(temp.next != null){
           prev = temp;
           temp = temp.next;
        }
        prev.next = null;
        System.out.println("Deletion at Tail Successfully");
        size--;
    }

    public void deleteNode(int pos){
        if(pos > size  || pos <= 0){
            System.out.println("Wrong input !!");
            return;
        }
        if(pos == 1){
            deleteHead();
            return;
        } else if(pos == size){
            deleteTail();
            return;
        } else{
            int counter = 1;
            Node<Integer> prev = null;
            Node<Integer> temp = head;
            while(counter < pos && temp != null){
                counter++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            size--;
            System.out.println("Deletion successfully at position " + pos);
        }
    }

    public void updateNode(int pos, int updatedValue){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        int counter = 1;
        Node<Integer> temp = head;
        while(counter < pos && temp != null){
            counter++;
            temp = temp.next;
        }
        if(temp != null && counter == pos){
            temp.data = updatedValue;
        }else{
            System.out.println("Size of LL is less than position " + pos);
        }
        System.out.println("Update at position " + pos + " was Successful");
    }

    public boolean searchNode(int searchValue){
        if(head == null){
            System.out.println("List is Empty ");
            return false;
        }
        int counter = 1;
        Node<Integer> temp = head;
        while(temp != null){
            if(temp.data == searchValue){
                System.out.println("found at position " + counter + " was successful");
                return true;
            }
            counter++;
            temp = temp.next;
        }
        System.out.println("Not found !!");
        return false;
    }
}
class Node<T>{
    T data;
    Node next;
    Node(){
        this.next = null;
    }
    Node(T data){
        this.next = null;
        this.data = data;
    }
}



