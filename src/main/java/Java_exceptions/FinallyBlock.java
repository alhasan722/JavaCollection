package Java_exceptions;

public class FinallyBlock {
    public static void main(String[] args)
    {
        System.out.println("Program is started.....");
        String a=null;

        try {
            System.out.println(a.length());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally////this block is optional and always execute. if we get exception or not get exception. it will always execute
        {
            System.out.println("you are enter finally block");
        }
        System.out.println("Program is finished...");
    }

}
