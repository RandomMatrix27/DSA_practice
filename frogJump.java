package Recursion;

public class frogJump {
    static int findMinCost(int arr[],int n,int idx){
        if(idx==n-1) return 0;
        int op1= Math.abs(arr[idx]-arr[idx+1])+findMinCost(arr,n,idx+1);
        if(idx==n-2) return op1;
        int op2= Math.abs(arr[idx]-arr[idx+2])+findMinCost(arr,n,idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,20};
        int n=arr.length;
        System.out.println(findMinCost(arr,n,0));
    }
}
