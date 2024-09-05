package Stacks;

import java.util.Stack;

public class PostToIn {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String post = "953+4*6/-";
        for(int i=0;i<post.length();i++){
            char ch = post.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2= val.pop();
                String v1= val.pop();
                char op = ch;
                // postfix -> v1 v2 op
                String t = '('+v1+op+v2+')';
                val.push(t);
            }
        }
        System.out.println("the infix is:"+val.peek());
    }
}
