package Java_collection;

import java.util.*;

public class Practise_Array_hashMap {
   public static void main(String[] args)
    ////How to sort ArrayList?
    /*{
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("K");
        list.add("M");
        list.add("Y");
        list.add("E");
        list.add("C");
        list.add("D");
        Collections.sort(list);

        System.out.println(list);
    }*/
    /////How to sort custom objects?
   /*{
       class student {
           int id;
           String name;
           int age;

           student(int id, String name, int age) {
               this.id = id;
               this.name = name;
               this.age = age;


               }
           @Override
           public String toString() {
               return id + " " + name + " " + age;

           }
       }

       ArrayList<student> students = new ArrayList<>();
        students.add(new student(1,"ali",25));
       students.add(new student(2,"ayaan",7));
       students.add(new student(3,"alo",37));
       students.sort(Comparator.comparingInt(s -> s.age));
       System.out.println(students);
       }*/
   /*{
       ///How to convert List to Set?
       ArrayList list=new ArrayList();
       list.add("a");
       list.add("a");
       list.add("g");
       list.add("d");

       Set<String> set=new HashSet<>(list);

       System.out.println(set);

   }*/
    /////How to find duplicate elements in ArrayList?
   {
       ArrayList list=new ArrayList();
       list.add("a");
       list.add("k");
       list.add("l");
       list.add("a");
       list.add("b");
       list.add("b");

       HashSet set=new HashSet(list);

       for (Object o:set)
       {
           if (!set.add(o))
               {
               System.out.println(o);
               }
       }

   }
}


