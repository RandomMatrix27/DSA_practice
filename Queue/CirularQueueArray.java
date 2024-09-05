package Queue;

public class CirularQueueArray {
    public static class CqueueArray{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]= new int[5];
        public void add(int data) throws Exception{
            if(size==arr.length){
               throw new Exception("Queue is Full !!!");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=data;
            }
            else if(rear<arr.length-1){  // normal case
                arr[++rear]=data;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=data;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }

        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else return arr[front];
        }
        public void display() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else if(front<rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{  // rear<front
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) throws Exception{
        CqueueArray q1 = new CqueueArray();
//        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        q1.remove();
        q1.display();
        q1.add(5);
        q1.add(6);
        q1.display();
        for(int i: q1.arr){
            System.out.print(i+" ");
        }
        System.out.println();




    }
}
