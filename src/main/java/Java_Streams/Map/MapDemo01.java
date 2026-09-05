package Java_Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo01 {
    public static void main(String[] args)
    {
        List<String> vehicles= Arrays.asList("bus","car","flight","train");
        List<String>vehiclesuppercase=new ArrayList<String>();
        ////before Java8/without stream
        /*for ( String name:vehicles)
            {
            vehiclesuppercase.add(name.toUpperCase());
            }*/
        /////with stream all create uppper case
        vehicles.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehiclesuppercase);
    }
}
