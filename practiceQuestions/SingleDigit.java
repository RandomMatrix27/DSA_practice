package practiceQuestions;

import java.util.Scanner;

public class SingleDigit {
    public static int makeSingledigit(int num){
        if(num>0 && num<=9){
            return num;
        }
        while(num>9){
            if(num%2 == 0){
                num=(num-2)/2;
            }
            else{
                num=num/2;
            }
        }
        return makeSingledigit(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans =makeSingledigit(num);
        System.out.println(ans);

    }
}
