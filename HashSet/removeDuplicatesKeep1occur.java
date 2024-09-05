package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicatesKeep1occur {
    static void removeDup(int arr[]){
        HashSet<Integer> st = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
           st.add(arr[i]);
        }
        for(int i:st){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int arr[]=new int [t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        removeDup(arr);
    }
}
