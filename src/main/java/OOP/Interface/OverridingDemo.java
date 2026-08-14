package OOP.Interface;

class Bank
{
    double roi()
    {
      return 0;
    }
}
   class chase extends Bank
   {
       double roi()
       {
          return 10.5;
           }
   }

   class boa extends Bank
   {
       double roi()
       {
          return 11.5;
       }
   }

public class OverridingDemo {
    public static void main(String[] args)
    {
      chase c = new chase();
        System.out.println(c.roi());
        boa b = new boa();
        System.out.println(b.roi());
    }
}
