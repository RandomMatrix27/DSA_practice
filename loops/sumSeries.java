package loops;

import java.util.Scanner;

public class sumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i);
                sum+=-i;
            }
            else{
                System.out.print(" + "+i+" - ");
                sum+=i;
            }

        }
        System.out.println();
        System.out.println(sum);
    }
}
