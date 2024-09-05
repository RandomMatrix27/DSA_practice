package Sorting;

public class RotatedSortedArray {

    static int search(int arr[],int targ){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==targ){
                return mid;
            }

            else if(arr[mid]<arr[end]){ // mid to end is sorted
                if(targ>arr[mid] && targ<=arr[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            else{ //start to mid is sorted
                if(targ>=arr[st] && targ<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }

    // for duplicate elements

    static int search_(int arr[],int targ){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==targ){
                return mid;
            }

            else if(arr[st]==arr[mid] && arr[end]==arr[mid]){
                st++;
                end--;

            }

            else if(arr[mid]<=arr[end]){ // mid to end is sorted
                if(targ>arr[mid] && targ<=arr[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            else{ //start to mid is sorted
                if(targ>=arr[st] && targ<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,1};
        int targ=2;
        System.out.println(search_(arr,targ));

    }
}
