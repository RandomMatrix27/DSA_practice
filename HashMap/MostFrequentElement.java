package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    static int getMostfrequentEle(int arr[]){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int el: arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int mxFreq=0; int ansKey=-1;
//        for(var e: mp.entrySet()){
//            if(e.getValue()>mxFreq){
//                mxFreq=e.getValue();
//                ansKey=e.getKey();
//            }
        for(var key:mp.keySet()) {
            if(mp.get(key)>mxFreq){
                mxFreq=mp.get(key);
                ansKey=key;
            }
        }
        return ansKey;

    }
    public static void main(String[] args) {
        int arr[]= {1,3,2,1,4,1};
        int res=getMostfrequentEle(arr);
        System.out.println(res);
    }
}
