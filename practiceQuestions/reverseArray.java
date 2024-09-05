package practiceQuestions;

public class reverseArray {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int [] reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {44,2,33,10,11,9};
        System.out.println("original array");
        printArray(arr);
        int res[]=reverseArray(arr);
        System.out.println("reverse array");
        printArray(res);

    }
}
