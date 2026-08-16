package OOP.homeWork.day_02;
/////Method overloading
public class Calculator {

    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add(double w, double f)
    {
        System.out.println(w+f);
    }

    public static   void main (String[] args)
    {
        Calculator calc = new Calculator();
        calc.add(10,20);
        calc.add(100,200,300);
        calc.add(10.4, 20.6);

    }
}
