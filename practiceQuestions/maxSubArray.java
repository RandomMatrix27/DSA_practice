package practiceQuestions;

public class maxSubArray {
    static int findMaxSubArray(int arr[]){
        int max= Integer.MIN_VALUE;
        int sum = 0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
        int res=findMaxSubArray(arr);
        System.out.println(res);
    }
}
