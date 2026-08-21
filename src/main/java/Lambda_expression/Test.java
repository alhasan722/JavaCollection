package Lambda_expression;

interface Cab
{
    public void cab();
}


public class Test {
    public static void main(String[] args)
    {
        Cab cab=()->System.out.println("yellow cab is booked.......");
        cab.cab();
    }
}
