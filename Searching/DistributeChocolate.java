package Searching;

public class DistributeChocolate {

    static boolean isDivisionPossible(int arr[],int m,int maxChocAllowed){
         int numStudents=1;
         int choc=0; //

         for(int i=0;i<arr.length;i++){
             if(arr[i]> maxChocAllowed) return false;

             if(choc+arr[i] <= maxChocAllowed){
                 choc+=arr[i];
             }
             else{
                 numStudents++;
                 choc=arr[i];
             }
         }
         return numStudents<=m;
    }

    public static int distributeChoc(int arr[], int m){
        if(arr.length<m) return -1;
        int ans=0;
        int st=1, end= (int)1e9;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(isDivisionPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int m = 2;
        System.out.println(distributeChoc(arr,m));
    }
}
