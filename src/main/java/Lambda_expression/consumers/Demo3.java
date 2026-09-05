package Lambda_expression.consumers;

import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args)
    {
        Consumer<String> c1= s->System.out.println(s+" "+"is white");
        Consumer<String> c2=s->System.out.println(s+" "+"is having four legs");
        Consumer<String> c3=s->System.out.println(s+" "+"is having two eyes");
        /*c1.accept("cow");
        c2.accept("cow");
        c3.accept("cow");*/

        c1.andThen(c2).andThen(c3).accept("cow");
    }
}
