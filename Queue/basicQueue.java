package Queue;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class basicQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);


    }
}
