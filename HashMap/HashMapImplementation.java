package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        // to add data
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        // to get value for key
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("harry"));

        mp.put("Akash",20);

        // to remove a pair
        System.out.println(mp.remove("Akash"));

        // checks if key contains in the hashMap
        System.out.println(mp.containsKey("Akash"));

        // Adding new entry if key doesnt exist
        mp.putIfAbsent("Yashika",32);

        //get all keys in the HashMop
        System.out.println(mp.keySet());

        // get all values in the Hashmap
        System.out.println(mp.values());

        // getting all the entries in the Hashmap
        System.out.println(mp.entrySet());

        // traversing through all entries of the HashMap
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }


    }

}
