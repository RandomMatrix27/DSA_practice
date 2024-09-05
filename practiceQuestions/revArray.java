package practiceQuestions;

public class revArray {
    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void plsRev(int arr[],int l){
        int res[]= new int [l];
        int j =0;
        for(int i=arr.length-1;i>=0;i--){
            res[j++]=arr[i];
        }
        printArr(res);
    }
    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void plsRevInPlace(int arr[],int l){
        int i=0,j=l-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int l = arr.length;
//        plsRev(arr,l);
        printArr(arr);
        plsRevInPlace(arr,l);
        printArr(arr);

    }
}
