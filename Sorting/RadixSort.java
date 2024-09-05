package Sorting;

public class RadixSort {

    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    static void advCountingSort(int arr[],int place){
        int n=arr.length;
        int output[]=new int[n];

        int max = findMax(arr);
        int cnt[]=new int[10];
        // count array is being made
        for(int i=0;i<arr.length;i++){
            cnt[(arr[i]/place)%10]++;
        }
        // prefix sum of count array
        for(int i=1;i<cnt.length;i++){
            cnt[i]+=cnt[i-1];
        }
        // find index of each ele in the org array and put it in output array
        for(int i=n-1;i>=0;i--){
            int idx= cnt[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            cnt[(arr[i]/place)%10]--;
        }

        // copy all elements from output to original array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    static void radixSort(int arr[]){
        int max = findMax(arr);
        for(int place = 1; max/place>0;place*=10){
            advCountingSort(arr,place);
        }
    }

    static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={43,453,626,894,0,3};
        printArray(arr);
        radixSort(arr);
        printArray(arr);

    }
}
