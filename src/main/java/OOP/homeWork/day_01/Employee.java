package OOP.homeWork.day_01;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary>=0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary cannot be negative");
        }
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setId(1);
        System.out.println(emp.getId());
        emp.setSalary(1000.45);
        System.out.println(emp.getSalary());
        emp.setName("zain");
        System.out.println(emp.getName());
        emp.setSalary(-2000);

    }
}
