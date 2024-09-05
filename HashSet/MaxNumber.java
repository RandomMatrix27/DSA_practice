package HashSet;

import java.util.HashSet;

public class MaxNumber {
    static int maxNumberOnTable(int bag[]){
        HashSet<Integer> st = new HashSet<>();
        int maxnum=0;
        for(int num:bag){
            if(!st.contains(num)){
                st.add(num);
                maxnum=Math.max(maxnum,st.size());
            }
            else{
                st.remove(num);
            }
        }
        return maxnum;
    }

    public static void main(String[] args) {
        int nums[]={2,1,1,3,2,3};
        System.out.println(maxNumberOnTable(nums));
    }
}
