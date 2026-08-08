package Java_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args)
    {
      String arr[]={"cow","goat","cat"};
      for (String str:arr)
          System.out.println(str);

      ArrayList list=new ArrayList(Arrays.asList(arr));////convert array to ArrayList
      System.out.println(list);


    }
}


