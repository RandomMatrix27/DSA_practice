package practiceQuestions.Sorting;

public class InsertionSort {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] insertSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }
    static void display(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,3,1,2,4};
        display(arr);
        int res[]=insertSort(arr);
        display(res);

    }
}
