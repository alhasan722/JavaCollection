package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class filterDemo2 {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("ana","jhon","habibaa","kumon","david");
        List<String>longname=new ArrayList<String>();
        /*longname=names.stream().filter(str->str.length()>6&& str.length()<8).collect(Collectors.toList());
        System.out.println(longname);*/
        ////names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
        names.stream().filter(str->str.length()>6 && str.length()<8).forEach((System.out::println));





    }
}
