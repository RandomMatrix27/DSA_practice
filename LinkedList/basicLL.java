package LinkedList;

public class basicLL {

    static void displayLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static void displayLLrev(Node head){
        if(head==null) return;
        displayLLrev(head.next);
        System.out.print(head.data+" ");
    }

    static int lengthLL(Node head){
        int cnt = 0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }

    public static class Node{
        int data;   // value of itself
        Node next;  // address of the next node
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(106);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

//        displayLL(a);
//        System.out.println();
//        displayLLrev(a);
        System.out.println(lengthLL(a));






    }
}
