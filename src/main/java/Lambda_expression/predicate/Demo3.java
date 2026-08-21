package Lambda_expression.predicate;

import java.util.function.Predicate;

////joining predicates and or negate
/// p1 ---check number is even
/// p2 check number grater than 50
///
public class Demo3 {
    public static void main(String[] args)
    {
        int a[]={5,7,9,11,10,50,56,20,40,46,34,39,80};
        Predicate<Integer> p1=x->x%2==0;
        Predicate<Integer> p2=x->x>50;

         /*for (int b:a)
       {
            ///if (p1.test(b) && p2.test(b))
        if (p1.and(p2).test(b))
            {
                System.out.println(b);
            }
        }*/

        ///or
        /*for (int b:a)
            {
            if (p1.or(p2).test(b))
            {
                System.out.println(b);
            }
            }*/
        for (int b:a)
        {
            if (p1.negate().test(b))
            {
                System.out.println(b);
            }
        }

    }
}
