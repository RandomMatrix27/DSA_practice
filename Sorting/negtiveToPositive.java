package Sorting;

public class negtiveToPositive {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortnveTopve(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            while(arr[i]<0) i++;
            while(arr[j]>=0) j--;
            if(i<j){
                swap(arr,i,j);
                i++;
                j--;
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
        int arr[]={19,-20,7,-4,-13,11,-5,3};
        printArray(arr);
        sortnveTopve(arr);
        printArray(arr);
    }
}
