package OOP.homeWork.day_03.Combine_everything;

public class Developer extends Employee {

    String language;
    Developer(int id,String name,double salary,String language)
    {
        super(id,name,salary);
        this.language=language;

    }

    void displayDetails()
    {
        System.out.println(id+","+name+","+salary+","+language);
    }

    void displayDetails(String message)
        {
        System.out.println(message);
        }

}
