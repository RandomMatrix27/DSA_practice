package Sorting;

public class stringLexicograph {
    static void swap(String fruits[],int i,int j){
        String temp =fruits[i];
        fruits[i]=fruits[j];
        fruits[j]=temp;

    }
    static void arrangeLexico(String fruits[],int n){
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minIdx])<0){
                    minIdx=j;
                }
            }
            swap(fruits,i,minIdx);
        }
    }
    static void printArray(String arr[]){
        for(String val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[]={"papaya","lime","watermelon","apple","mango","kiwi"};
        int n= arr.length;
        printArray(arr);
        arrangeLexico(arr,n);
        printArray(arr);
    }
}
