package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int findFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return findFibonacci(n-1)+findFibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int ans=findFibonacci(i);
            System.out.print(ans+" ");
        }

    }
}
