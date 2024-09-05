package LinkedList.LeetCode;

import practiceQuestions.LinkedList_prac;

public class nthNodeEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node nthNode(Node head, int n){
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m = size-n+1;
        temp=head;  // reinitializing temp to head again
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public static Node deleteNthFromEnd(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void displayLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        // 100 -> 13 -> 4 -> 5 -> 12 -> 10
        Node q = nthNode(a,2);
        System.out.println(q.data);

        Node p = nthNode2(a,4);
        System.out.println(p.data);
        a=deleteNthFromEnd(a,3);
        displayLL(a);
    }
}
