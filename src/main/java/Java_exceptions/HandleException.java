package Java_exceptions;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args)
    {
        System.out.println("Program is started.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        ////ArithmeticException
        try
        {
            System.out.println(100/num);
        }
        catch(ArithmeticException e) {
            System.out.println("invalid data");
        }

        System.out.println("Program is finished...");
        System.out.println("Program is existed.....");
    }
}
