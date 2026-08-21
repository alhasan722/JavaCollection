package Lambda_expression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    int experience;
    Employee(String name, int sal, int experi)
    {
        ename = name;
        salary = sal;
        experience = experi;

    }
}

public class Demo2 {
    public static void main(String[] args)
    {
        ////ex01
      Employee emp=new Employee("john",40000,5);
        Predicate<Employee> pr=r->(r.salary>30000 && r.experience>4);
        System.out.println(pr.test(emp));

        ////Ex02
        ArrayList<Employee> em=new ArrayList<>();
        em.add(new Employee("john",40000,5));
        em.add(new Employee("manik",60000,6));
        em.add(new Employee("ricky",70000,5));
        em.add(new Employee("david",30000,3));
        em.add(new Employee("yah",20000,2));

        for (Employee e:em)
        {
            if(pr.test(e))
            {
                System.out.println(e.ename+" "+e.salary+" "+e.experience);
            }
        }

    }
}
