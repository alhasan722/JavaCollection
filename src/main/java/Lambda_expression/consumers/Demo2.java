package Lambda_expression.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    String gender;
    Employee(String ename,int salary,String gender)/////constractor
    {
        this.ename=ename;
        this.salary=salary;
        this.gender=gender;
    }
}


public class Demo2 {
    public static void main(String[] args)
    {
    ArrayList<Employee> emplist = new ArrayList<Employee>();
    emplist.add(new Employee("john",20000,"male"));
    emplist.add(new Employee("rani",40000,"female"));
    emplist.add(new Employee("james",50000,"male"));
    emplist.add(new Employee("james",80000,"female"));
    Function<Employee,Integer> f = emp->(emp.salary*10)/100;
        Predicate<Integer> p =b->b>=5000;

        Consumer<Employee> c = emp->{
          System.out.println(emp.ename);
          System.out.println(emp.salary);
          System.out.println(emp.gender);
        };
for (Employee e:emplist)
{
    int bonus=f.apply(e);////function
    if (p.test(bonus))////predicate
    {
        c.accept(e);
        System.out.println(bonus);
    }
}
    }
}
