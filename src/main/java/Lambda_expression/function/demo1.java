package Lambda_expression.function;

import java.util.function.Function;

public class demo1 {
    public static void main(String[] args)
    { /////apply is a method here.
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(10));
        System.out.println(f.apply(20));
        System.out.println(f.apply(30));

        ////String length
        ///String --->length--->Int
        Function<String,Integer> f1=p->p.length();
        System.out.println(f1.apply("hello"));
        System.out.println(f1.apply("welcome"));
    }
}
