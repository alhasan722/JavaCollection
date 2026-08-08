package Java_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo01 {
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();////default capacity 16 and load factor 0.75
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add(true);
        hs.add('A');
        hs.add(null);
        System.out.println(hs.size());
        System.out.println(hs);///Insertion order not preserve
        hs.remove("welcome");////value no index
        System.out.println("after remove the element:" +hs);
        ///contains
        System.out.println(hs.contains("welcome"));
        System.out.println(hs.contains('A'));
        System.out.println(hs.isEmpty());
        ///reading element from hashset by for each loop
        /*for (Object o : hs)
        {
            System.out.println(o);
        }*/

        Iterator it = hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

