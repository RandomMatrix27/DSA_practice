package Recursion;

public class LinearSearrch {
    static boolean findLin(int arr[],int num,int idx){
        if(idx>arr.length-1 ){
            return false;
        }

        if(arr[idx]==num){
            return true;
        }
        return findLin(arr,num,idx+1);
    }
    static void allindices(int arr[],int num,int idx){
        if(idx>=arr.length){
            return;
        }

        if(arr[idx]==num){
            System.out.print(idx+" ");
        }
        allindices(arr,num,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={2,5,2,6,1,9,0,2};

//        if(findLin(arr,0,0)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("no");
//        }
        allindices(arr,2,0);

    }
}
