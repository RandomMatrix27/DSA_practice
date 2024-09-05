package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static int [] twoSum1(int arr[],int targ){
        int res[]= {-1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==targ-arr[i]){
                    res = new int[]{i,j};
                    return res;
                }
            }
        }
        return new int[]{};
    }

    public static int [] twoSum2(int arr[],int targ){
        int res[]= {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int p= targ-arr[i];
            if(mp.containsKey(p)){
                res=new int[]{i,mp.get(p)};
                return res;
            }
            mp.put(arr[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int ans[]=twoSum2(arr,9);
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
