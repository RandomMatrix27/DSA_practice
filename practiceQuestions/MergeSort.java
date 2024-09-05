package practiceQuestions;

public class MergeSort {
    public static void merge(int arr[],int st,int mid,int end){
        int n1= mid-st+1;
        int n2 = end-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[st+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];

        int i=0,j=0,k=st;

        while(i<n1 && j<n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=left[j++];
        }

    }

    public static void mergeSort(int arr[],int st,int end){
        if(st>=end) return;
        int mid= st+(end-st)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5};
        printArray(arr);
        int st=0,end=arr.length-1;
        mergeSort(arr,st,end);
        printArray(arr);
    }
}
