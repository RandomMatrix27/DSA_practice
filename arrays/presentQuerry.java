package arrays;

import java.util.Scanner;

public class presentQuerry {

    static int[] makeFreqArray(int arr[]){
        int freq[]=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
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
        int freq[]=makeFreqArray(arr);
        System.out.println("Enter the num of queries:");
        int q= sc.nextInt();
        while(q>0){
            System.out.println("enter the number to be searched:");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;

        }
    }
}
