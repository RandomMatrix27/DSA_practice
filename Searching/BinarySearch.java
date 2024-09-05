package Searching;

public class BinarySearch {
    static boolean binarysearch(int arr[],int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(target==arr[mid]) return true;
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }

    static boolean recBinarySearch(int arr[],int st,int end,int targ){
        if(st>end){
            return false;
        }
        int mid=(st+end)/2;
        if(targ==mid) return true;
        else if(targ<mid){
            return recBinarySearch(arr,st,mid-1,targ);
        }
        else{
            return recBinarySearch(arr,mid+1,end,targ);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int target=3;
        System.out.println(recBinarySearch(arr,0,n-1,3));
        System.out.println(binarysearch(arr,target));
    }

}
