package loops;

import java.util.Scanner;

public class count_digitds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;

        }
        System.out.println("number of digits="+cnt);

    }


}
