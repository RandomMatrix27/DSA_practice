package Stacks;

public class LLImplementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LLStack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty...");
                return -1;
            }
            int ele=head.data;
            head= head.next;
            return ele;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty...");
                return -1;
            }
            return head.data;
        }

        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void display_rev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(8);
        st.push(99);
        st.display();
        st.push(100);

    }
}
