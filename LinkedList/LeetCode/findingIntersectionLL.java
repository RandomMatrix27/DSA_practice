package LinkedList.LeetCode;

public class findingIntersectionLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node findingIntersection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int m=0;
        int n=0;

        while(temp1!=null){
            m++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            n++;
            temp2=temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if(m>n){
            for(int i=1;i<=m-n;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=1;i<=n-m;i++) {
                temp2 = temp2.next;
            }
        }
        while(temp1!=null && temp2!=null){
            if(temp1.data== temp2.data){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }

    public static void display(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(1);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(30);
        Node g = new Node(70);
        Node h = new Node(90);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        f.next=g;
        g.next=h;
        h.next=c;

        Node z=findingIntersection(a,f);
        display(z);



    }
}
