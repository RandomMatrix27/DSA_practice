package Searching;

public class firstOccurance {
    static int firstOccurance(int arr[],int st,int end,int targ){
        if(st>end) return -1;
        int mid= st+((end-st)/2);
        if (targ == arr[mid]) {
            // Check if it is the first occurrence
            if(mid == 0 || arr[mid - 1] != targ) {
                return mid;
            }
            else{
                return firstOccurance(arr, st, mid - 1, targ);
            }
        }
        else if (targ < arr[mid]) {
            return firstOccurance(arr, st, mid - 1, targ);
        }
        else {
            return firstOccurance(arr, mid + 1, end, targ);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,5,6,6,7,8,8};
        int targ=6;
        int st=0,end=arr.length-1;
        System.out.println(firstOccurance(arr,st,end,targ));
    }
}
