package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseAQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n= q.size();
        System.out.println("Original Queue");
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while(q.size()>n-k){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=0;i<n-k;i++){
            int x=q.remove();
            q.add(x);
        }
        System.out.println(q);
    }
}
