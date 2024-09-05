package Sorting;

// DUTCH NATIONAL FLAG Algorithm

public class Sort012 {

    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void sort012(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;

            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }


    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num [] = {2,2,0,0,1,1,2,0,1,0};
        printArray(num);
        sort012(num);
        printArray(num);
    }
}
