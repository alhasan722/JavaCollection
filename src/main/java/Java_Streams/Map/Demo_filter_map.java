package Java_Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Demo_filter_map {
    public static void main(String[] args)
    {
        List<Employee> employeesList = Arrays.asList(
               new Employee(101,"john",25000),
        new Employee(101,"wrik",35000),
        new Employee(101,"jhu",45000),
        new Employee(101,"ricky",55000),
                new Employee(101,"wan",65000)
        );
        /////combination of filter and map
        List<Integer>emplsaleList=employeesList.stream().filter(emp->emp.salary>25000).map(emp->emp.salary).collect(Collectors.toList());
        System.out.println(emplsaleList);
    }
}
