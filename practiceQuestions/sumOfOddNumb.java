package practiceQuestions;

public class sumOfOddNumb {
    public static int findSumODD(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,7,10,12,11,1};
        int ans =findSumODD(arr);
        System.out.println(ans);
    }
}
