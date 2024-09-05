package MultiDimArray;

import java.util.Scanner;

public class multiDimenArray {


    static void multiArray(int arr1[][], int arr2[][],int r1,int c1,int r2,int c2){
        int mul[][] = new int [r1][c2];
        for(int i=0;i<r1;i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        print2dArr(mul);
    }

    static int [][] addArrays(int arr1[][], int arr2[][],int r1,int c1,int r2,int c2){
        int res[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return res;

    }
    static void print2dArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of rows:");
        int r1 = sc.nextInt();
        System.out.println("enter num of cols:");
        int c1 = sc.nextInt();
        int arr1[][]=new int [r1][c1];
        System.out.println("Enter "+ r1*c1+" Elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter num of rows:");
        int r2 = sc.nextInt();
        System.out.println("enter num of cols:");
        int c2 = sc.nextInt();
        int arr2[][]=new int [r1][c1];
        System.out.println("Enter "+ r1*c1+" Elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        print2dArr(arr1);
        System.out.println("Matrix 2:");
        print2dArr(arr2);
        int res[][]=addArrays(arr1,arr2,r1,c1,r2,c2);
        System.out.println("Resultant Matrix:");
        print2dArr(res);
        System.out.println("Resultant mult matrix");
        multiArray(arr1,arr2,r1,c1,r2,c2);
    }
}
