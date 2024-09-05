package practiceQuestions;

import java.util.Scanner;

public class Fibbonacci {
    static int findFib(int num){
        if(num==0||num==1) {
            return num;
        }
        int res =findFib(num-1)+findFib(num-2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int res=findFib(num);
        System.out.println(res);
    }
}
