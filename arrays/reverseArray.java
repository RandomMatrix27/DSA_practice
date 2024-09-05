package arrays;

public class reverseArray {
    static int [] reverse_Array(int[] arr, int n){
        int new_arr[]= new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            new_arr[j]=arr[i];
            j++;
        }
        return new_arr;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray_without_newArray(int arr[]){
        int i=0, j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("the original array is:");
        printArray(arr);
        int n=arr.length;
        reverseArray_without_newArray(arr);
        printArray(arr);

    }
}
