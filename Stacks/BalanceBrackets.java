package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    public static int isBalanced(String inp){
        Stack<Character> st = new Stack<>();
        int ans=0;
        for(int i=0;i<inp.length();i++){
            char ch = inp.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    ans+=1;
                }
                else if(st.peek()=='(') st.pop();
            }
        }
        ans+=st.size();
        return ans;
//        if(st.size()>0) return false;
//        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(isBalanced(inp));
    }
}
