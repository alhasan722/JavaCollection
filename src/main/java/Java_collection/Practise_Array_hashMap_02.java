package Java_collection;

import java.util.*;

public class Practise_Array_hashMap_02 {
   public static void main(String[] args)
   /*{
       ////How to iterate HashMap?
       HashMap<String,Integer> map=new HashMap<>();
       map.put("a",1);
       map.put("b",2);
       map.put("c",3);

       Iterator it = map.entrySet().iterator();
       while (it.hasNext())
       {
           System.out.println(it.next());
       }
   }*/
    ////How to count frequency using HashMap?
   {
       String[] names = {"A", "A", "B", "C", "D", "E"};

       HashMap<String, Integer> map = new HashMap<>();

       for (String name : names) {

           if (map.containsKey(name)) {
               map.put(name, map.get(name) + 1);
           } else {
               map.put(name, 1);
           }
       }

       System.out.println(map);
   }



}


