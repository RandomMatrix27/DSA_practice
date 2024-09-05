package LinkedList.LeetCode;

public class Add2Numbers {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node addTwoNumber(Node l1,Node l2){
        Node temp1 = l1;
        Node temp2 = l2;
        Node dummy = new Node(0);
        Node curr=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null){
            int x=0;
            int y=0;
            if(temp1 != null){
                x=temp1.data;
                temp1=temp1.next;
            }
            if(temp2 != null){
                y=temp2.data;
                temp2=temp2.next;
            }
            int sum = carry+x+y;
            carry=sum/10;
            curr.next = new Node(sum%10);
            curr=curr.next;
        }
        if(carry>0){
            curr.next=new Node(carry);
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
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);


        Node x = new Node(5);
        Node y = new Node(6);
        Node z = new Node(4);

        a.next=b;
        b.next=c;
        x.next=y;
        y.next=z;

        display(a);
        display(x);
        Node res =addTwoNumber(a,x);
        display(res);

    }
}
