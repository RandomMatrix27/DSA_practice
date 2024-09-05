package HashSet;

import java.util.HashSet;

public class LongestConsequtive {
    public int longestConsecutive(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        for(int num: arr) st.add(num);
        int maxStreak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
}
