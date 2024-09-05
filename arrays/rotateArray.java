package arrays;

import java.util.Scanner;

public class rotateArray {
    static int [] rotate_Arr(int arr[],int k,int n){
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int l=0;l<n-k;l++){
            ans[j++]=arr[l];
        }
        return ans;
    }



    static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[],int strt,int end){
        while(strt<end){
            swap(arr,strt,end);
            strt++;
            end--;
        }
    }

    static void rotateInplace(int arr[],int k,int n){
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         printArray(arr);
         Scanner sc= new Scanner(System.in);
         int k=sc.nextInt();
         int n=arr.length;
//         int res[]=rotate_Arr(arr,k,n);
//         System.out.println("The array after rotating "+k+ " times is");
//         printArray(res);

        rotateInplace(arr,k,n);
        printArray(arr);


    }
}
