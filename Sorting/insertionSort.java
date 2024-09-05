package Sorting;

public class insertionSort {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void plsInsertion(int arr[], int n){
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,5,4,2};
        int n=arr.length;
        printArray(arr);
        plsInsertion(arr,n);
        printArray(arr);
    }
}
