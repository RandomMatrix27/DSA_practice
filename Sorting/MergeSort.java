package Sorting;

import java.util.Scanner;

public class MergeSort {

    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];

        // transferring values from arr to left and right accordingly
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=arr[l+i];
        for(j=0;j<n2;j++) right[j]=arr[mid+1+j];

        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else
                arr[k++]=right[j++];
        }
        // what if some indexes are left behind
        while(i<n1){
            arr[k++]=left[i++];
        }

        while(j<n2){
            arr[k++]=left[j++];
        }

    }

    static void mergeSort(int arr[],int l , int r){
        if(l>=r) return;

        int mid =(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,5,2};
        printArray(arr);
        int l=0,r=arr.length-1;
        mergeSort(arr,l,r);
        printArray(arr);


    }
}
