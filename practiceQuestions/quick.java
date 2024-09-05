package practiceQuestions;

public class quick {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[],int st,int end){
        int pivot=arr[st];
        int cnt= 0;

        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot) cnt++;
        }
        int pivIdx= st+cnt;
        swap(arr,st,pivIdx);

        int i=st,j=end;
        while(i<pivIdx && j>pivIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pivIdx && j>pivIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }

    public static void quickSort(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int piv = partition(arr,st,end);
        quickSort(arr,st,piv-1);
        quickSort(arr,piv+1,end);
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        printArray(arr);
        int st=0,end=arr.length-1;
        quickSort(arr,st,end);
        printArray(arr);
    }
}
