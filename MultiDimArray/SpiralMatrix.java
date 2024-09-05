package MultiDimArray;

import java.util.Scanner;

public class SpiralMatrix {

    static int [][] SpiralOrder(int n){
        int matrix [][] = new int [n][n];
        int topRow=0,bottRow=n-1, leftCol=0 , rightCol=n-1;
        int curr=1;
        while(curr<=n*n){
            //top row -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && curr<=n*n;j++){
               matrix[topRow][j] = curr++;
            }
            topRow++;
            // right COl -> topRow to bottomRow
            for(int i=topRow;i<=bottRow && curr<=n*n;i++){
                matrix[i][rightCol] = curr++;
            }
            rightCol--;
            // bottom row -> right Col to leftCOL
            for(int j=rightCol;j>=leftCol && curr<=n*n;j--){
                matrix[bottRow][j] = curr++;
            }
            bottRow--;

            // left col -> bottomROW to topROW
            for(int i=bottRow;i>=topRow && curr<=n*n;i--){
               matrix[i][leftCol]= curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int matrix [][] = SpiralOrder(n);
        printMatrix(matrix);


    }
}
