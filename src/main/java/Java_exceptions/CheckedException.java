package Java_exceptions;

public class CheckedException {
    public static void main(String[] args)
    {
        System.out.println("Program is started...");
        System.out.println("Program in progress...");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println("Program is finished...");
        System.out.println("Program exited...");
    }
}
