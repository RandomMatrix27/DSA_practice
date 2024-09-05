package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    static void bucketSort(float arr[]){
        int n = arr.length;

        // creating buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // creating empty buckets
        for(int i=0;i<n;i++){
            buckets[i]= new ArrayList<Float>();
        }

        // Add elements into buckets
        for(int i=0;i<n;i++){
            int bucketIndex = (int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }

        // sort each bucket individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
         // merge all the element in the bucket
        int index = 0;
        for(int i=0;i< buckets.length;i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
            }
        }
    }
    static void printArray(float arr[]){
        for(float i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         float arr[]={0.5f,0.4f,0.3f,0.2f,0.1f};
         printArray(arr);
         bucketSort(arr);
         printArray(arr);
    }
}
