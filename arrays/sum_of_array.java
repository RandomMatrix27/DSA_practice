package arrays;
class operations_Array{
    int searchInArray(int num){
        int arr[]={10,5,3,1,8,4};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
public class sum_of_array {
    public static void main(String[] args) {
//        int arr[]= {1,5,3};
//        int sum =0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum );
        operations_Array obj1= new operations_Array();
        int res=obj1.searchInArray(3);
        System.out.println(res);
    }
}
