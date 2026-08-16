package OOP.homeWork.day_02;


class animal {
    void eat()
    {
        System.out.println("animal eat");
    }

    void  sleep()
    {
        System.out.println("animal sleep");
    }
}

public class Dog extends animal
{
    void bark()
    {
        System.out.println("animal bark");
    }
    public static void main (String[] args)
    {
        Dog dg=new Dog();
        dg.eat();
        dg.sleep();
        dg.bark();
    }

}



