package practiceQuestions;

public class selection {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static void selectsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            swap(arr,i,minIdx);
        }
    }
    static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4};
        printArr(arr);
        selectsort(arr);
        printArr(arr);
    }
}
