package Java_exceptions;

import java.util.Scanner;

public class ExceptionsDemo1 {
    public static void main(String[] args)
    {
        System.out.println("Program is started.....");
        Scanner sc=new Scanner(System.in);
        ///example 01
        /*System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(100/num);////ArithmeticException when a number divided by zero. we get ArithmeticException.
        */
       ////exapmple 02
        /*int a[]=new int[5];
        System.out.println("enter a position(0-4):");
        int pos=sc.nextInt();
        System.out.println("enter a value:");
        int val=sc.nextInt();
        a[pos]=val;/////ArrayIndexOutOfBoundsException. when enter an array position more than array range
         */
        ////example 03
       /*String value="dhaka";////NumberFormatException. when we want to convert string to number we need to have number with string format. If we put alohabate it will not able to convert to integer
       int value1=Integer.parseInt(value);
       System.out.println(value1);

        */
         ////example 04
        String val=null;
        System.out.println(val.length());////NullPointerException

        System.out.println("Program is finished...");
        System.out.println("Program is existed.....");
    }
}
