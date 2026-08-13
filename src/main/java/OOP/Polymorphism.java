package OOP;

public class Polymorphism {
    int a=10;
    int b=20;

    void sum()
    {
        System.out.println(a+b);
    }
    void sum(int x,int y)
        {
        System.out.println(x+y);
        }

    void sum(int x, double y)
        {
        System.out.println(x+y);
        }
        void sum(double x, int z)
        {
        System.out.println(x+z);
        }
        void sum(int x, int y, int z)
        {
        System.out.println(x+y+z);
        }


}
