package arrays;

import java.util.Scanner;

public class sorting_0s1s {


    static void sortZeroesAndOnes(int arr[]){
        int n=arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void approachUsing2Pointers(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
    }


    static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
//        sortZeroesAndOnes(arr);
        approachUsing2Pointers(arr);
        System.out.println("the sorted array is:");
        printArray(arr);
    }
}
