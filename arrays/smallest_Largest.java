package arrays;

public class smallest_Largest {
    static int[] smallestLargestele(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int res[]=new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        res[0]=min;
        res[1]=max;
        return res;
    }
    public static void main(String[] args) {
        int arr[]={6,3,0,5,1};
        int res[]=smallestLargestele(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
        System.out.println();


    }
}
