package arrays;

import java.util.Scanner;

public class sqauresSorting {
    static int [] sortSquares(int arr[]){
        int n= arr.length;
        int left=0,right=n-1;
        int new_arr[]=new int[n];
        int j=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                new_arr[j++]= arr[left]*arr[left];
                left++;
            }
            else{
                new_arr[j++]= arr[right]*arr[right];
                right--;
            }
        }
        return new_arr;
    }

    static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0, j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
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
        int res[]=sortSquares(arr);
        reverseArray(res);
        System.out.println("the sorted sqaure array is:");
        printArray(res);

    }
}
