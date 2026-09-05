package Lambda_expression.Home_work;

import java.util.function.Predicate;

public class checkEvenNumber {
    public static void main(String[] args)
    {
        int number=21;
        Predicate<Integer> p1=x->x%2==0;
        System.out.println(p1.test(number));
    }
}
