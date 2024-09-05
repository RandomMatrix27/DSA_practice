package Stacks;

import java.util.Stack;

public class basicsOfStacks {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(32);
        st.push(44);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
