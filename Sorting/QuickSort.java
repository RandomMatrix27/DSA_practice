package Sorting;

public class QuickSort {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int st,int end){
        int pivot = arr[st];
        int cnt = 0;    // to count the number of elements less than pivot element
        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot) cnt++;
        }
        int pivIdx= st+cnt;
        swap(arr,st,pivIdx);

        int i=st,j=end;
        // elements on the left ---> lesser && elements on the right ---> greater than pivot
        while(i<pivIdx && j>pivIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pivIdx && j>pivIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }

    static void quickSort(int arr[],int st,int end){
        if(st>=end) return;

        int pi=partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }

    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={6,3,3,1,5,4,4,1,5};
        printArray(arr);
        int st=0,end=arr.length-1;
        quickSort(arr,st,end);
        printArray(arr);
    }
}
