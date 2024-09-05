package loops.patterns;

import java.util.Scanner;

public class numericalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){  // traversing the rows
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
