package OOP.homeWork.day_01;

public class studentClass {

    int id;
    String name;
    int age;

    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args)
    {
        studentClass s = new studentClass();
        s.id=101;
        s.name="hasan";
        s.age=18;
       s.display();
       studentClass s1 = new studentClass();
       s1.id=101;
        s1.name="ayaan";
        s1.age=7;
        s1.display();
    }
}
