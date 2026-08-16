package OOP.homeWork.day_02;

public class Calculator_02 {

    void area(int side)
    {
        System.out.println(side);
    }
    void area(int length,int width)
    {
        System.out.println(length*width);
    }

    void area(double radius)
    {
        System.out.println(radius);
    }

    public static void main(String[] args)
    {
        Calculator_02 ca = new Calculator_02();
        ca.area(5);
        ca.area(10,20);
        ca.area(10.55);
    }
}

