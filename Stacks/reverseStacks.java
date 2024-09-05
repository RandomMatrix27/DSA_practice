package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class reverseStacks {
    public static void plsReverse(Stack<Integer>st){
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while(st.size()!=0){
            st2.push(st.pop());
        }
//        System.out.println(st2);
        while(st2.size()!=0){
            st3.push(st2.pop());
        }
//        System.out.println(st3);
        while(st3.size()!=0){
            st.push(st3.pop());
        }
        System.out.println("Stack after reversing");
        System.out.println(st);

    }

    public static void pushElementBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushElementBottom(st,x);
        st.push(top);
    }

    public static void plsReverseRec(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        plsReverseRec(st);
        pushElementBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Using iteration:");
        System.out.println("original stack:");
        System.out.println(st);
//        plsReverse(st);
        System.out.println("Using recursion:");
        plsReverseRec(st);
        System.out.println(st);
    }
}
