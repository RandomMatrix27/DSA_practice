package practiceQuestions;

public class SearchInsertPosition {
    static int binSearch(int nums[],int l,int r,int targ){
        int mid = (l+r)/2;
        if(l==r){
            if(nums[mid]<targ) return mid+2;
            else return mid;
        }
        if(nums[mid]==targ) return mid;
        else if(targ<nums[mid]){
            return binSearch(nums,l,mid-1,targ);
        }
        else return binSearch(nums,mid+1,l,targ);
    }
    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        return binSearch(nums,l,r,target);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7};
        int res = searchInsert(arr,3);
        System.out.println(res);

    }
}
