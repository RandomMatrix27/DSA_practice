package practiceQuestions;

public class rotateArray {
    static int[] rotatePls(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int newArr[]=new int[n];
        for(int i=n-k;i<n;i++){
            newArr[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            newArr[j++]=arr[i];
        }
        return newArr;
    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArr(arr);
        int k=2;
        int res[]=rotatePls(arr,k);
        printArr(res);

    }
}
