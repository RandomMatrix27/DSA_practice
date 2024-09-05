package Recursion;

import java.util.ArrayList;

public class returnSSQ {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr= s.charAt(0);
        ArrayList<String> smallAns= getSSQ(s.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;

    }
    static void getSSQ2(String inp,String currAns){
        if(inp.length()==0){
            System.out.print(currAns+" ");
            return;
        }
        char curr = inp.charAt(0);
        String remain= inp.substring(1);
        getSSQ2(remain,currAns+curr);
        getSSQ2(remain,currAns);

    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);
        System.out.println("Approach 2");
        getSSQ2("abc","");

    }
}
