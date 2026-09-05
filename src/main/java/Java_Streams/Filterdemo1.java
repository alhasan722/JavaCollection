package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,15,20,30,25,40);
        List<Integer> list2 = new ArrayList<Integer>();
        /*list2=list.stream().filter(n->n%2==0).collect(Collectors.toList());///after filtering we are storing the data in some other collection
        System.out.println(list2);*/
        ///list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
