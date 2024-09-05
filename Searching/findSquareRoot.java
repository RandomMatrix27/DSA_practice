package Searching;

public class findSquareRoot {
    static int sqrt(int targ){
        int st=0,end=targ;
        int ans=-1;
        while(st<=end){
            int mid=st+((end-st)/2);
            int val=mid*mid;
            if(val==targ) return mid;
            else if(val<targ){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int targ=37;
        System.out.println(sqrt(targ));
    }
}
