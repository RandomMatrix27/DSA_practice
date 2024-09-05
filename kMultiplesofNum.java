package Recursion;

import java.util.Scanner;

public class kMultiplesofNum {
    static void findMultiple(int num,int k){
        if(k==1){
            System.out.print(num+",");
            return;
        }
        findMultiple(num,k-1);
        System.out.print(num*k+",");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int k= sc.nextInt();
        findMultiple(num,k);
    }
}
