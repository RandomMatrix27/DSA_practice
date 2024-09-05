package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertAtIndex {

    static void displayRevRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRec(st);
        st.push(top);
    }

    static void displayRec(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        displayRec(s);
        System.out.print(top+" ");
        s.push(top);
    }

    static void insertBottom(Stack<Integer> st, int idx, int val){
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>idx){
            st2.push(st.pop());
        }
        st.push(val);
        while(st2.size()!=0){
            st.push(st2.pop());
        }
        System.out.print(st);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Scanner sc = new Scanner(System.in);
        System.out.println(st);
//        int idx = sc.nextInt();
//        int val = sc.nextInt();
//        insertBottom(st,idx,val);
        System.out.println("Reverse");
        displayRevRec(st);
        System.out.println();
        System.out.println("Original");
        displayRec(st);
    }
}
