package OOP;

public class polymorphism_adderMain {
    public static void main(String[] args)
    {
      Polymorphism adder = new Polymorphism();
      adder.sum();////01
      adder.sum(100,200);////02
      adder.sum(100,250.40);////03
      adder.sum(100.30,250);////04
        adder.sum(100,250,100);///05
    }
}
