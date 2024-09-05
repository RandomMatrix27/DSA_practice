package Sorting;

public class putting0sAtEnd {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void put0satend(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    swap(arr,j,j+1);
                }
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
        int arr[]={0,5,0,0,0,0};
        int n=arr.length;
        printArray(arr);
        put0satend(arr,n);
        printArray(arr);
    }
}
