package OOP.homeWork.day_03.Abstraction;

interface Payment {
    void pay();
}

class CreditCard implements Payment {

    public void pay()
    {
        System.out.println("credit card pay");
    }
}

class UPI implements Payment {
    public void pay()
    {
        System.out.println("UPI pay");
    }
}
class CashOut implements Payment {
    public void pay()
    {
        System.out.println("cash out pay");
    }
}

public class Paymentmethod
{
    public static void main(String[] args)
    {
       CreditCard c = new CreditCard();
        c.pay();
        UPI u = new UPI();
        u.pay();
        CashOut cOut = new CashOut();
        cOut.pay();

    }

}
