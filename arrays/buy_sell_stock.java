package arrays;

public class buy_sell_stock {
    public static int maxprofit(int arr[]){
        int profit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    profit=Math.max(profit,arr[j]-arr[i]);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
        int res=maxprofit(arr);
        System.out.println(res);
    }
}
