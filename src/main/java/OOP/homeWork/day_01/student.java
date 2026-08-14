package OOP.homeWork.day_01;

public class student {

    int id;
    String name;
    int age;

    student(int sid,String sname,int sage)
    {
        id=sid;
        name=sname;
        age=sage;
    }

    void display()
    {
        System.out.println(id+","+name+","+age);
    }

    public static void main(String[] args)
    {
        student s=new student(10,"jhon",28);
       s.display();

    }
}
