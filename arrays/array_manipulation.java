package arrays;

public class array_manipulation {

    static int maxNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int max_2nd_num(int arr[]){
        int max= maxNumber(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secMax=maxNumber(arr);
        return secMax;
    }


    static int unique_ele(int arr[]){
        int min_cnt=Integer.MAX_VALUE;
        int min_num=0;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    cnt++;
                }
            }
            if(cnt<min_cnt){
                min_cnt=cnt;
                min_num=arr[i];
            }
        }
        System.out.println("the min number is: "+min_num+ " the count is: "+min_cnt);
        return min_num;
    }


    static int first_repeat(int arr[]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                    return num;

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,-2,-2,0,-9,-9};
//        int res=max_2nd_num(arr);
        int res=first_repeat(arr);
        System.out.println(res);

    }
}
