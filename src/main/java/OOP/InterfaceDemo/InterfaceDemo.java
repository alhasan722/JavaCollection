package OOP.InterfaceDemo;

interface Shape
{
    int length=10;////final and static
    int width=20;////final and static

    void circle();////abstract method

    default  void square()
    {
        System.out.println("this is square---default method");
    }

    static void rectangle()
    {
        System.out.println("this is rectangle---static method");
    }

}
public class InterfaceDemo implements Shape
{
    public void  circle()
    {
        System.out.println("this is circle---abstract method");
    }

    void triangle()
    {
        System.out.println("this is triangle---static method");
    }
    public static void main(String[] args)
    {
        ////senario 01
     InterfaceDemo obj = new InterfaceDemo();
        obj.circle();///abstract method
        obj.square();//// default method
        Shape.rectangle();/////direct calls but mrthod not within the class so we need to pass the interface name then method name
        obj.triangle();
    ////Senario 02
        Shape sp=new InterfaceDemo();
        sp.circle();///abstract method
        sp.square();////defult method
        Shape.rectangle();//// static method we can directly access

    }

}
