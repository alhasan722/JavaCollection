package Java_Streams.Map;

import java.util.Arrays;
import java.util.List;

public class mapdemo2 {
    public static void main(String[] args)
    {
        List<String> vehicles= Arrays.asList("bus","car","flight","train");
         /////without java 8
        /*for (String name:vehicles)
            {
            System.out.println(name.length());
            }*/
        ///////with stream length of the string
        vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));

    }
}
