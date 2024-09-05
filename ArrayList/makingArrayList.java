package ArrayList;

import java.util.ArrayList;

public class makingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        System.out.println("Printing element in index of the array List"+l1.get(1));


        System.out.println("printing the list using loop");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        System.out.println("printing the array using l:");
        System.out.println(l1);



    }


}
