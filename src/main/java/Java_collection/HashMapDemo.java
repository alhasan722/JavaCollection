package Java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap <String,Integer> m=new HashMap<String,Integer>();
        m.put("A",1);
        m.put("B",2);
        m.put("C",3);
        m.put("D",4);
        m.put("E",5);
        m.put("B",9);
        m.put("F",3);


        System.out.println(m);
        System.out.println(m.get("A"));
        m.remove("B");
        System.out.println(m);
        System.out.println(m.containsKey("C"));
        System.out.println(m.containsKey("K"));
        System.out.println(m.containsValue(1));
        System.out.println(m.containsValue(12));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());///return all key as set
        for (Object l:m.keySet())
        {
            System.out.println(l);
        }
        System.out.println(m.values());///return all values as set
        for (Object r:m.values())
        {
            System.out.println(r);
        }

        /*for (Object h:m.keySet())
        {
            System.out.println(h + " " + m.get(h));////get method to retrive the value
        }*/
        ///System.out.println(m.entrySet());///return all entries as set
///Entry method
        for (Map.Entry k:m.entrySet())
        {
            System.out.println(k.getKey() + " " + k.getValue());
        }
        ////Iterator method
        Set s=m.entrySet();
        Iterator it=s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
