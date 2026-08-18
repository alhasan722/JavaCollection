package OOP.homeWork.day_03.Combine_everything;

public class main {
    public static void main(String[] args)
    {
        Developer de =new Developer(10,"john",5000.70,"java");
        de.displayDetails();
        de.displayDetails("Developer Information");
        Manager ma=new Manager(15,"cook",50000.70,15);
                ma.displayDetails();

    }
}
