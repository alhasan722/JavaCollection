package Java_Streams;

import java.util.ArrayList;
import java.util.List;

class product
{
    int id;
    String name;
    double price;
    public product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class filterDemo4 {
    public static void main(String[] args)
    {
        List<product> productslist = new ArrayList<product>();
        productslist.add(new product(1,"HP",25000));
        productslist.add(new product(2,"Dell",30000));
        productslist.add(new product(3,"Lenovo",40000));
        productslist.add(new product(4,"Samsung",50000));

        productslist.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price));
    }
}
