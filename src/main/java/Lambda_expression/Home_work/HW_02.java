package Lambda_expression.Home_work;

interface number {
    int number(int a, int b);
}

public class HW_02 {
    public static void main(String[] args)
    {
        number num=(a,b)->(a+b);
        System.out.println(num.number(10,20));
    }
}
