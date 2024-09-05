package practiceQuestions;

public class numberOfSuperiorEle {
    public static int findSuperior(int arr[]){
        int supele= Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                cnt++;
                i++;
            }
            if(arr[i]>arr[i-1]){
                cnt++;

            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={7,9,5,2,8,7};
        int res=findSuperior(arr);
        System.out.println(res);
    }
}
