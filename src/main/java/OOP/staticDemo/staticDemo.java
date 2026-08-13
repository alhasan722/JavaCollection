package OOP.staticDemo;

public class staticDemo {
    static int a=10;
    int b=20;

    static void m1()
    {
        System.out.println("this is m1");
    }

    void m2()
    {
        System.out.println("this is m2");
    }
    public static void main(String[] args)
    {
        ////static method can access static stuff directly
        ///System.out.println(a);
        ////m1();
        staticDemo demo = new staticDemo();
        demo.m2();
        System.out.println(demo.b);;

    }
}
