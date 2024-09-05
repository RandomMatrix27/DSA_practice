package Sorting;

public class selectionSort {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void plsSelection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minIDX= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIDX]){
                    minIDX=j;
                }
            }
            swap(arr,i,minIDX);
        }
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,5,1,4,3,100,2};
        int n=arr.length;
        printArray(arr);
        plsSelection(arr,n);
        printArray(arr);
    }
}
