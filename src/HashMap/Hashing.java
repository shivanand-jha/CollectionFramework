package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insertion
        set.add(3);
        set.add(5);
        set.add(3);
        if (set.contains(5))
        {
            System.out.println("Contains");
        }
        else
        {
            System.out.println("Doesn't contain");
        }
        set.remove(3);//remove(val); clear();
        System.out.println(set);
        System.out.println(set.size());//set.size();
        //iterator
        Iterator it = set.iterator();
        //hashNext function
//        for (int a :set) {
//            System.out.println(a);
//        }
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
