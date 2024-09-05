package practiceQuestions.Sorting;

public class selectionSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int [] selection(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
            }
            swap(arr,i,minIdx);
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
        int res[]=selection(arr);
        display(res);
    }
}
