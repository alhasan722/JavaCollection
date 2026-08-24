package Lambda_expression.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    Employee(String ename,int salary)
    {
        this.ename=ename;
        this.salary=salary;
    }
}

public class Demo2 {
    public static void main(String[] args)
    {
      ArrayList<Employee> empList=new ArrayList<Employee>();
      empList.add(new Employee("jhon",10000));
      empList.add(new Employee("vick",20000));
      empList.add(new Employee("mary",30000));
      Function<Employee,Integer> f=e-> {
          int sal = e.salary;
          if (sal >= 10000 && sal < 20000)
              return (sal *10/100);
          else if (sal >= 20000 && sal < 30000)
              return (sal *20/100);
          else if (sal >= 30000 && sal < 40000)
              return (sal *30/100);
          else return (sal *40/100);
      };

      Predicate<Integer> p=b->b>5000;

      for (Employee e:empList)
      {
          int bonus=f.apply(e);///funtion lambda
          if (p.test(bonus))////Predicated
          {
              System.out.println(e.ename + " " + e.salary);
              System.out.println(bonus);
          }
      }

    }
}
