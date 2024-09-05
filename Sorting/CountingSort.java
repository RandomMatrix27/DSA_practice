package Sorting;

public class CountingSort {

    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    static void countingSort(int arr[]){
        // find the largest element in the array
        int max = findMax(arr);
        int cnt[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            cnt[arr[i]]++;
        }
        int k = 0 ;
        for(int i=0;i<cnt.length;i++){
            for(int j=0;j<cnt[i];j++){
                arr[k++]=i;
            }
        }
    }

    static void advCountingSort(int arr[]){
        int n=arr.length;
        int output[]=new int[n];

        int max = findMax(arr);
        int cnt[]=new int[max+1];
        // count array is being made
        for(int i=0;i<arr.length;i++){
            cnt[arr[i]]++;
        }
        // prefix sum of count array
        for(int i=1;i<cnt.length;i++){
            cnt[i]+=cnt[i-1];
        }
        // find index of each ele in the org array and put it in output array
        for(int i=n-1;i>=0;i--){
            int idx= cnt[arr[i]]-1;
            output[idx]=arr[i];
            cnt[arr[i]]--;
        }

        // copy all elements from output to original array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,2,5};
        printArray(arr);
        advCountingSort(arr);
        printArray(arr);
    }
}
