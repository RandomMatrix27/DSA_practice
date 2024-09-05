package Recursion;

import java.util.Scanner;

public class sumofDigitsAlternateSigns {
    static int findSum(int n){
        if(n>=0 && n<=9 ){
            return n;
        }
        int lastdig=n%10;
        if(lastdig%2==0){
            return findSum(n/10) -lastdig;
        }
        else return findSum(n/10)+lastdig;

    }
    static int findSumN(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return findSumN(n-1) - n;
        }
        else{
            return findSumN(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=findSumN(n);
        System.out.println(ans);
    }
}
