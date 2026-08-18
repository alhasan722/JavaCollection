package OOP.homeWork.day_03.Abstraction;

abstract class Shape {
    abstract void area();
}

class circle extends Shape
{

    void area()
    {
        System.out.println("area of circle");
    }
}

class rectangle extends Shape
{
    void area()
    {
        System.out.println("area of rectangle");
    }
}
public class main{
    public static void main(String[] args)
    {
        Shape sp = new circle();
        sp.area();
        rectangle r = new rectangle();
        r.area();

    }
}
