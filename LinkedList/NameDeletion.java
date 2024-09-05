package LinkedList;

public class NameDeletion {
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
        }
    }
    public static Node deleteName(Node a, String name){
        Node dummy = new Node("Random");
        Node temp = dummy;
        Node head = a;

        while(head!=null){
            if(head.data!=name){
                Node x = new Node(head.data);
                temp.next=x;
                temp=temp.next;
                head=head.next;
            }
            else head=head.next;
        }
        return dummy.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node("Amruth");
        Node b = new Node("Vageesh");
        Node c = new Node("Sreyas");
        Node d = new Node("Vishal");
        Node e = new Node("Hemant");
        Node f = new Node("Suryaa");

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        Node res=deleteName(a,"Suryaa");
        display(res);



    }
}
