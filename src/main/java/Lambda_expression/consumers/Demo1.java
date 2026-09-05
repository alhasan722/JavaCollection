package Lambda_expression.consumers;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args)
    {
        Consumer<String> c=s->System.out.println(s);////taking one parameter and perfprm some operation but do not return any value
        c.accept("hello");
    }
}
