package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
        list.add(15);
        System.out.println(list);
        List<Integer> nList = new ArrayList<Integer>();
        nList.add(120);
        nList.add(140);
        nList.addAll(list);
        System.out.println(nList);
        list.addAll(nList);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(Integer.valueOf(13));
        System.out.println(list);
        list.set(0, 9);
        System.out.println(list);
        list.clear();
        System.out.println(list);
//        list.contains(15);//boolean
        System.out.println(list);
    }
}