package Sorting;
public class bubbleSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void plsbubble(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    static void printArray(int arr[],int n){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,3,10,5,1};
        int n= arr.length;
        printArray(arr,n);
        plsbubble(arr,n);
        printArray(arr,n);
    }

}
