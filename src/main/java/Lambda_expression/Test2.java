package Lambda_expression;
interface cab2{
    public String bookCab(String source, String target);
}
public class Test2 {
    public static void main(String[] args)
    {
        cab2 cab = (source,target)->{System.out.println("yellow cab booked from"+source+"To"+target);return ("price:500");};
        cab.bookCab("dallas","Austin");
    }
}
