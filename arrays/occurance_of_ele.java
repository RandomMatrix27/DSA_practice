package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class occurance_of_ele {
    static void count_occ_ele(int arr[],int num){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                cnt++;
            }
            else{
                continue;
            }
        }
        System.out.println("the occurance of "+ num +" is "+ cnt);
    }
    static int lastOccurance(int arr[],int num){
        int ind = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                ind=i;
            }

        }
        return ind;
    }
    static int strictlyGreater(int arr[],int num){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                cnt++;
            }
        }
        return cnt;
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr,n);
//        count_occ_ele(arr,5);
//        int ans=lastOccurance(arr,7);
//        System.out.println(ans);
        int ans= strictlyGreater(arr,6);
        System.out.println("the numbers Strictly greater than 6"+ " are "+ans);



    }
}
