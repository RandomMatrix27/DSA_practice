package Recursion;

public class recurssion_in_arrays {
    static void printRecurssive(int arr[],int idx){
        if(idx== arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printRecurssive(arr,idx+1);
    }
    static int maxInArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns= maxInArray(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
    static int sumInArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallSum=sumInArray(arr,idx+1);
        return arr[idx]+smallSum;
    }
    public static void main(String[] args) {
        int arr[]={0};
        int n=arr.length;
        //printRecurssive(arr,0);
        System.out.println(maxInArray(arr,0));
        System.out.println(sumInArray(arr,0));
    }
}

