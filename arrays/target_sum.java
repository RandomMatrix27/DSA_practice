package arrays;

public class target_sum {
    static int triplet_target(int arr[],int targ){
        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==targ){
                        cnt1++;
                    }
                }
            }
        }
        return cnt1;
    }
    static int pairs_target(int arr[],int targ){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targ){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,5,1,6};
        int res=pairs_target(arr,7);
        System.out.println(res);
        int arr2[]={1,4,5,6,3};
        int res2=triplet_target(arr2,12);
        System.out.println("no: of triplets = "+res2);
    }
}
