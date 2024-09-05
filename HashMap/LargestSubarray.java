package HashMap;

import java.util.HashMap;

public class LargestSubarray {
    static int zeroSumLargestSubarray(int arr[],int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int mxLen=0,prefSum=0;
        for(int i=0;i<n;i++){
           prefSum+=arr[i];
           if(mp.containsKey(prefSum)){
               mxLen=Math.max(mxLen,i-mp.get(prefSum));
           }
           else{
               mp.put(prefSum,i);
           }
        }
        return mxLen;

    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,-25};
        int n=arr.length;
        int ans=zeroSumLargestSubarray(arr,n);
        System.out.println(ans);
    }
}
