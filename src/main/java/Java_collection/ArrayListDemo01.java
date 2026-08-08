package Java_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo01 {
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add("welcome");
        al.add(10.5);
        al.add(true);
        System.out.println(al);

        ///size
        System.out.println("number of element in array:"+al.size());
        ////remove
        al.remove(1);
        System.out.println(al);
        ///add(index,object)
        al.add(1,"java");
        System.out.println(al);
        ///retrive specific element
        System.out.println(al.get(2));
        ///change element /replace
        al.set(2,"c++");
        System.out.println(al);
        ///search-contains()
        System.out.println(al.contains("java"));
        ///isempty
        System.out.println(al.isEmpty());
        System.out.println("reading element using loop");

////for loop
        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i));

        ///for each loop
        System.out.println("reading element for each loop");
        for (Object x:al)
            System.out.println(x);
/////iterator
        System.out.println("reading element with itaretor");
        Iterator itr=al.iterator();/////// get an iterator positioned before the first element
        while (itr.hasNext())//////// loop while there are more elements
        { System.out.println(itr.next());
        }

    }

}
