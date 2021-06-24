


import java.util.*;
import java.util.Map.Entry;
/**
 * hashmaps
 */
public class Hashmaps {

    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(1,"One");
        hash.put(2,"Two");
        hash.put(3,"Three");
        System.out.println(hash);
        System.out.println(hash.keySet());
        System.out.println(hash.entrySet());
        Set <Entry<Integer,String>> entries = hash.entrySet();
        for(Entry<Integer,String> entry : entries)
        {
            entry.setValue(entry.getValue());

        }
        System.out.println(hash);

        
    }
}