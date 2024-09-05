package MultiDimArray;

import java.util.Scanner;

public class rotaateMatrix90 {

    static void swapinMatrix(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void transposeInPlace(int matrix[][], int r, int c) {
        swapinMatrix(matrix, r, c);
    }

    static void rotateMat(int matrix[][], int r) {
        transposeInPlace(matrix,r,r);
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }
    }

    static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and cols of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix [][] = new int [r][c];
        int totalEle= r*c;
        System.out.println("enter "+ totalEle+" values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("input Matrix");
        printMatrix(matrix);

        rotateMat(matrix,r);
        printMatrix(matrix);
    }
}
