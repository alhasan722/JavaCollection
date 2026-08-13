package OOP.Encapsulation;

public class AccountMain {
    public static void main(String[] args)
    {
        Account acc = new Account();
        acc.setAccno(12345);
        System.out.println(acc.getAccno());
    }
}
