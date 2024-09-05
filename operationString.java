package Recursion;

import java.util.Scanner;

public class operationString {
    static  String removeA(String inp,int idx){
        if(idx==inp.length()){
            return "" ;
        }
        String smallAns=removeA(inp,idx+1);
        char curr=inp.charAt(idx);
        if(curr!='a'){
            return curr+smallAns;
        }
        else{
            return smallAns;
        }
    }
    static String reverse(String inp,int idx){
        if(idx==inp.length()){
            return "";
        }
        String revAns=reverse(inp,idx+1);
        return revAns+inp.charAt(idx);
    }
    static boolean isPalindrome(String inp){
        String rev=reverse(inp,0);
        return rev.equals(inp);
    }
    static boolean isPalindrome2(String inp,int l, int r){
        if(l>=r){
            return true;
        }
        return(inp.charAt(l)==inp.charAt(r) && isPalindrome2(inp,l+1,r-1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp =sc.nextLine();
//        String ans=removeA(inp,0);
//        String ans = reverse(inp,0);
        if(isPalindrome2(inp,0,inp.length()-1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
//        System.out.println(ans);
    }
}
