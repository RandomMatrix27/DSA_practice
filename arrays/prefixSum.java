package arrays;

import java.util.Scanner;

public class prefixSum {

    static int [] prefixArray(int arr[]){
        int n=arr.length;
        int prefixArr[]= new int[n];
        prefixArr[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        return prefixArr;
    }

    static int [] prefixArray_sameArr(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of ele:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("the original array is:");
        printArray(arr);
        int res[]=prefixArray_sameArr(arr);
        System.out.println("the sorted prefix sum of the array is:");
        printArray(res);
    }
}
