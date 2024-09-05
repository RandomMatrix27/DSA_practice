package Recursion;

import java.util.Scanner;

public class sumOfDigits {
    static int sumofdigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int lastdig=n%10;
        return sumofdigits(n/10)+lastdig;
    }
    static int countofDigits(int n){
        int count=0;
        if(n>=0 && n<=9){
            return 1;
        }
        int lastdigit=n%10;
        count++;
        int ans=countofDigits(n/10)+count;
        return ans;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int res=sumofdigits(n);
        System.out.println(res);
        int res2=countofDigits(n);
        System.out.println(res2);
    }
}
