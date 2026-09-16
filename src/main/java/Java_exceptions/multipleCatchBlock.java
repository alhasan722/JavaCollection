package Java_exceptions;

public class multipleCatchBlock {
    public static void main(String[] args)
    {
        System.out.println("Program is started.....");
        String a=null;

        try {
            System.out.println(a.length());
        }
        catch(Exception e)////when we do not know the exception type, we can use the "exception". Exception is a super class of all kind of exception
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Program is finished...");
    }
}
