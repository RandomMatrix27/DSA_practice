package practiceQuestions;

public class LinkedList_prac {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size=0;

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){  // the LL is empty
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void insertAtHead(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void insertAt(int idx,int data){
            Node t = new Node(data);
            Node temp = head;
            if(idx==0){
                insertAtHead(data);
                return;
            }
            else if(idx==size){
                insertAtEnd(data);
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

        int getElement(int idx){
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        int size(){
            return size;
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
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.displayLL();
        ll.insertAtHead(40);
        ll.insertAtHead(50);
        ll.displayLL();
        ll.insertAt(2,60);
        ll.displayLL();
        ll.deleteAt(0);
        ll.displayLL();
        System.out.println(ll.size());
        ll.deleteAt(4);
        ll.displayLL();
        System.out.println(ll.size);
        System.out.println(ll.getElement(3));

    }
}
