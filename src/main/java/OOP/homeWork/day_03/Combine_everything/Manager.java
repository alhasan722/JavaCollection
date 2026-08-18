package OOP.homeWork.day_03.Combine_everything;

public class Manager extends Employee {

    int teamSize;

    Manager(int id,String name,double salary,int teamSize)
    {
        super(id,name,salary);
        this.teamSize=teamSize;

    }
    void displayDetails()
    {
        System.out.println(id+","+name+","+salary+","+teamSize);
    }

}
