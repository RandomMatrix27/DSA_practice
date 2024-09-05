package LinkedList;

public class reverseLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void displayrev(Node head){
        if(head==null) return;
        displayrev(head.next);
        System.out.print(head.val+" ");
    }

    public static Node reverse(Node head){
        if(head.next==null) return head; // base case
        Node newHead = reverse(head.next);  // function call / faith
        head.next.next = head;  // self work
        head.next=null;  // dont forget to point the head to null
        return newHead;
    }

    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        displayrev(a);
        display(a);
        a = reverse(a);
        System.out.println();
        display(a);


    }
}
