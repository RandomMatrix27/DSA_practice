package Sorting;

public class SortArr {
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void sortArr(int arr[]){
        int n= arr.length;
        int x=-1,y=-1;
        if(n<=1){
            return;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){  // first conflict
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int num[]={10,5,6,7,8,9,3};
        printArray(num);
        sortArr(num);
        printArray(num);

    }
}
