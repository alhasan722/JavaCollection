package OOP.InterfaceDemo;

public class C1 extends C2 implements I2,I1////Hybrid interfence
{

    public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        C1 c=new C1();
        c.m2();
        c.m1();
        c.m3();
    }
}
