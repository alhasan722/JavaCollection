package Java_collection;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args)
    {
        HashSet<Integer> evennumber = new HashSet<Integer>();
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        evennumber.add(10);
        System.out.println("HashSet:"+evennumber);
////Addall
        HashSet<Integer> number = new HashSet<Integer>();
        number.addAll(evennumber);
        number.add(12);
        System.out.println("HashSet:"+number);

   ////remove all
        number.removeAll(evennumber);
        System.out.println("HashSet:"+number);
    }
}
