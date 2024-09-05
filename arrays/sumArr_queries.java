package arrays;

import java.util.Scanner;

public class sumArr_queries {


    static int [] prefixArray_sameArr(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+= arr[i-1];
        }
        return arr;
    }


    static void printArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of ele:");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        System.out.println("enter the elements of the array:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("the original array is:");
//        printArray(arr);

        int prefSum[]=prefixArray_sameArr(arr);
        System.out.println("enter num of queries:");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter L");
            int l = sc.nextInt();
            System.out.println("Enter R");
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println(ans);
        }
    }
}
