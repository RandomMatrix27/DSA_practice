package Recursion;

import java.util.Scanner;

public class GCD {
    static int bruteForce(int n1, int n2){
        int min=0;
        if(n1<n2){
            min=n1;
        }
        else min=n2;

        int factor=0;
        for(int i=min;i>0;i--){
            if(n1%i==0 && n2%i==0){
                factor=i;
                return factor;
            }
        }
        return 1;

    }
    static int longDiviMethod(int n1, int n2){
        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        return n2;
    }
    static int recurssGCD(int n1, int n2){
        if(n2==0){
            return n1;
        }
        return recurssGCD(n2,n1%n2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int res=bruteForce(n1,n2);
        System.out.println(res);
        int res2=longDiviMethod(n1,n2);
        System.out.println(res2);
        int res3=recurssGCD(n1,n2);
        System.out.println(res3);
    }
}
