package ArrayList;

import java.util.ArrayList;

public class revArrayList {
    static void revList(ArrayList<Integer> list){
        int i=0;int j = list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original Array List:"+ list);
        revList(list);
        System.out.println("The Reversed ArrayList is:"+ list);

    }
}
