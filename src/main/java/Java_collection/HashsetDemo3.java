package Java_collection;

import java.util.HashSet;

public class HashsetDemo3 {
    public static void main(String[] args)
    {
        ///union, Intersection, difference

        HashSet <Integer>hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println("hashset1:"+ hs);

        HashSet <Integer> hs2 = new HashSet<Integer>();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);
        System.out.println("hashset2: "+ hs2);
////union
        hs.addAll(hs2);
        System.out.println("union: "+ hs);
        ///common element from both Hashset
        /*hs.retainAll(hs2);
        System.out.println("retainAll: "+ hs);*/
        ///differen
        //hs.removeAll(hs2);
        //System.out.println("removeAll: "+ hs);
///subset
        System.out.println(hs.containsAll(hs2));;



    }
}
