package Recursion;

import java.util.Scanner;

public class factorial {
    static int findFact(int n){
        if(n==0){
            return 1;
        }
        return n*findFact(n-1);
    }
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=findFact(n);
        System.out.println(res);
    }
}
