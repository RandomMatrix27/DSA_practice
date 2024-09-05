package LinkedList;

public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size=0;

        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        int getElement(int idx) {
            Node temp = head;
            if (idx < 0 || idx>size) {
                return -1;
            }
            else {
                for(int i=1;i<=idx;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
        }

        void deleteAt(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1) tail=temp;
            size--;
        }

        void displayLL(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
//        int size(){
//            Node temp=head;
//            int count =0;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
//        ll.displayLL();
//        System.out.println();
        ll.insertAtEnd(12);
//        ll.displayLL();
//        System.out.println();
//        System.out.println(ll.size());
        ll.insertAtHead(2);
        ll.insertAtHead(13);
        ll.displayLL();
        System.out.println();
        ll.insertAt(2,22);
        ll.displayLL();
        System.out.println();
        System.out.println(ll.tail.data);
        System.out.println(ll.getElement(2));
        ll.deleteAt(0);
        ll.displayLL();

    }
}
