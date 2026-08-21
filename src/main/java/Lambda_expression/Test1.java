package Lambda_expression;

interface Cab1
{
    public void bookcab(String source, String dest);
}

public class Test1 {
    public static void main(String[] args)
    {
        Cab1 cab=(source,dest)->{System.out.println("yellow cab is booked from " + source + " To " + dest);};
        cab.bookcab("dallas","Austin");
    }
}
