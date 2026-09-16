package Java_Streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args)

            /////map()return single object
    {
        /*
       List<Integer> list1= Arrays.asList(1,2,3,4,5);
       List<Integer>list2=list1.stream().map(b->b*10).collect(Collectors.toList());
       System.out.println(list2);*/

        ///FlatMap() return stream of object
        List<Integer>list3=Arrays.asList(1,2);
        List<Integer>list4=Arrays.asList(3,4);
        List<Integer>list5=Arrays.asList(5,6);
        List<List<Integer>>finallist=Arrays.asList(list3,list4,list5);
        ////taking argument and return in multiple stream
       List<Integer>finalresult= finallist.stream().flatMap(l->l.stream().map(s->s+20)).collect(Collectors.toList());
       System.out.println(finalresult);

    }
}
