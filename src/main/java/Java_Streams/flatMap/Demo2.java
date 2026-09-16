package Java_Streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args)
    {
        List<String> team1= Arrays.asList("scott","ayyan","afi");
        List<String> team2= Arrays.asList("mary","luna","tom");
        List<String> team3= Arrays.asList("ken","jony","kit");

        List<List<String>> teams= new ArrayList<List<String>>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        ///before jave 8
       /* for (List<String> teamlist:teams)
        {
            for (String aa:teamlist)
                {
                System.out.println(aa);
                }
        }*/
        List<String>FinalteamList=teams.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
        System.out.println(FinalteamList);
    }
}
