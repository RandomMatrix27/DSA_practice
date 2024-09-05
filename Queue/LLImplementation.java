package Queue;

public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int data){
            Node temp=new Node(data);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=tail.next;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty !!!");
                return -1;
            }
            int removed=head.data;
            head=head.next;
            size--;
            return removed;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty !!!");
                return -1;
            }
            return head.data;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty !!!");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
