package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    static int [] findGreater(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[]=new int[n];
        res[n-1]=-1;  // res -> -1
        st.push(arr[n-1]); // stack -> 4


        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int res[]=findGreater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

// Check for slower approach


        // Approach where TC ->O(n^2) and SC -> O(1)
//        for(int i=0;i<arr.length;i++){
//            res[i]=-1;
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    res[i]=arr[j];
//                    break;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for(int i=0;i<res.length;i++){
//            System.out.print(res[i]+" ");
//        }
//        System.out.println();


    }
}

