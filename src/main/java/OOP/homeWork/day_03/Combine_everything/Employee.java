package OOP.homeWork.day_03.Combine_everything;

public class Employee {
    int id;
    String name;
    double salary;

    Employee(int sid, String sname, double esalary)
    {
        id=sid;
        name=sname;
        salary=esalary;
    }
    void displayDetails()
    {
        System.out.println(id+","+name+","+salary);
    }
}
