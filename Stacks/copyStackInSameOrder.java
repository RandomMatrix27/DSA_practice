package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class copyStackInSameOrder{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // to reverse the order
        Stack<Integer> st2 = new Stack<>();
        while(st.size()!=0){
            st2.push(st.pop());
        }
        System.out.println("the reverse of stack is:");
        System.out.println(st2);

        Stack<Integer> copy = new Stack<>();
        while(st2.size()!=0){
            copy.push(st2.pop());
        }
        System.out.println("the copy of st is ");
        System.out.println(copy);
    }
}
