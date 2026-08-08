package Java_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("J");
        al.add("M");
        al.add("K");
        al.add("Y");
        al.add("D");
        al.add("B");
        al.add("A");


        ArrayList dup_al=new ArrayList();
        dup_al.addAll(al);////add all from another Array
        System.out.println(dup_al);
        dup_al.removeAll(al);///Remove all from Array
        System.out.println(dup_al);
        System.out.println(al);
        Collections.sort(al);///sort a Array
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());////reverse order
        System.out.println(al);
        Collections.shuffle(al);////shuffle Array
        System.out.println(al);





    }
}
