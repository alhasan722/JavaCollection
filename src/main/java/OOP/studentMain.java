package OOP;

public class studentMain {
    public static void main(String[] args)
    {
       ///student o=new student();
       ///01 using object referenc variable. accessing varibale through object
       /* o.sid=101;
        o.sname="ayaan";
        o.grad='A';
        o.printStudentData();*/

        ////02 using method. creating addtional method to store dat
        //o.setStudentData(102,"jony",'B');
        //o.printStudentData();

        ///03 using constructor
        student o=new student(104,"ali",'A');
        o.printStudentData();
    }
}
