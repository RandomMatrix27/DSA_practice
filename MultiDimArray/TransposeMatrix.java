package MultiDimArray;

public class TransposeMatrix {
    static int [][] findTranspose(int arr[][],int r,int c){
        int newMat[][]= new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                newMat[i][j]= arr[j][i];
            }
        }
        return newMat;
    }

    static void swapinMatrix(int arr[][],int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static void inPlaceTranspose(int arr[][],int r, int c){
        swapinMatrix(arr,r,c);
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
        int arr[][] = { {1,2,3},
                        {4,5,6},
                        {7,8,9}
                      };
        int r = 3;
        int c = 3;
        System.out.println("original matrix:");
        print2dArr(arr);
//        int res[][]=findTranspose(arr,r,c);
//        System.out.println("Transposed Matrix:");
//        print2dArr(res);
        inPlaceTranspose(arr,r,c);
        System.out.println("Transposed Matrix");
        print2dArr(arr);
    }
}
