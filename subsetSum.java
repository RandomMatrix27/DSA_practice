package Recursion;

import java.util.Arrays;

public class subsetSum {
    static void subsum(int arr[],int n,int idx,int sum){

        if(idx>=n){
            System.out.println(sum);
            return;
        }

        subsum(arr,n,idx+1,sum+arr[idx]);
        subsum(arr,n,idx+1,sum);

    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        int n= arr.length;
        subsum(arr,n,0,0);

    }
}
