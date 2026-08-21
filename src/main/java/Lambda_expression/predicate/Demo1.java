package Lambda_expression.predicate;



import java.util.function.Predicate;

////predicate---> one parameter returns boolen
/// use only if you have conditional checks in your program

public class Demo1 {
    public static void main(String[] args)
    {
        ////Ex 01
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));
        System.out.println(p.test(7));

        ///ex 02 check the length of given string is greater than 4 or not
        Predicate<String> p1=s->(s.length()>4);
        System.out.println(p1.test("dallas"));
        System.out.println(p1.test("york"));

        /////print array elements whose size is >4 from array
        String name[]={"hasan","orin","shohugh","tanim","rony"};
        for (String s: name)
           {
           if(p1.test(s))
               {
               System.out.println(s);
               }
           }
    }


}
