package loops;

import java.util.Scanner;

public class sum_each_digit_in_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("the sum of the digits ="+sum);
    }
}
