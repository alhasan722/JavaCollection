package Java_Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo3 {
    public static void main(String[] args)
    {
        List<Integer> numlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> multiNum=new ArrayList<Integer>();
        /////without java stream
        /*for (Integer i : numlist)
            {
            System.out.println(i*3);
            }*/

        /*multiNum=numlist.stream().map(num->num*3).collect(Collectors.toList());

        System.out.println(multiNum);*/
        numlist.stream().map(num->num*3).forEach(num-> System.out.println(num));
    }
}
