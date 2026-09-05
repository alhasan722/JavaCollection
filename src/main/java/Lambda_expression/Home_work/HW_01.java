package Lambda_expression.Home_work;
interface greeting {
    void greet();
}
public class HW_01 {
    public static void main(String[] args)
    {
       greeting hello=()->System.out.println("Hello, Java!");
       hello.greet();

    }
}


