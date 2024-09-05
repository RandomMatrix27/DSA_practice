package Recursion;

import java.util.Scanner;

public class pPowQ {
    static int findPow(int p, int q){
        if(q==0){
            return 1;
        }
        int smallans= findPow(p,q/2);
        if(q%2==0){
            return smallans*smallans;

        }
        return p*smallans*smallans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int res = findPow(p,q);
        System.out.println(res);
    }
}
