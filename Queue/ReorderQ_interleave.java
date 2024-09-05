package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQ_interleave {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Originally");
        System.out.println(q);
        int mid = q.size()/2;

        for(int i=0;i<mid;i++){
            st.push(q.remove());
        }
        // Queue --> 5,6,7,8
        // Stack --> 1,2,3,4

        while(st.size()>0){
            q.add(st.pop());
        }
        // Queue --> 5,6,7,8,4,3,2,1
        // Stack -->

        for(int i=0;i<mid;i++){
            st.push(q.remove());
        }
        // Queue --> 4,3,2,1
        // Stack --> 5,6,7,8

        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }

        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println("Finally");
        System.out.println(q);

    }
}
