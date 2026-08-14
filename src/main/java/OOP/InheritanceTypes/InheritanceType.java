package OOP.InheritanceTypes;

class A {
    int a = 100;

    void display() {
        System.out.println(a);
    }

}

    class B extends A
    {
        int b=300;
        void show()
        {
            System.out.println(b);
        }
    }
    class C extends B
    {
        int c=400;
        void print()
        {
            System.out.println(c);
        }
    }

public class InheritanceType {
    public static void main(String[] args)
    {
      /*B bb=new B();
        System.out.println(bb.a);
        System.out.println(bb.b);
        bb.display();
        bb.show();*/
        C cobj=new C();
        cobj.b=100;
        cobj.a=300;
        cobj.c=400;
        cobj.display();
        cobj.show();
        cobj.print();



    }
}
