package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
//        Insertion
        map.put("India",120);
        map.put("US",33);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //Searching :- containsKey and
        if (map.containsKey("China"))
            System.out.println("present");
        else
            System.out.println("not-present");
        map.get("China");
        System.out.println(map.get("China"));
        //iteration or traversing
        for(Map.Entry<String,Integer> j : map.entrySet())
        {
            System.out.println(j.getKey());
            System.out.println(j.getValue());
        }
        Set<String> keys = map.keySet();
        for(String d : keys)
        {
            System.out.println(d+" ");
        }
        //Deletion remove() for a single object
        // clear() all for whole Map
        map.remove("China");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
