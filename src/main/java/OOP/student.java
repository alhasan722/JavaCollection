package OOP;

public class student {

    int sid;
    String sname;
    char grad;

    void printStudentData()
    {
        System.out.println(sid+" "+sname+" "+grad);
    }

    void setStudentData(int id,String name,char gr)///method level variable or local variabl. this variable only accessable within this method
////this method storing data and pass to the class level internally
    {
        sid=id;
        sname=name;
        grad=gr;
    }

    student(int id,String name,char gr)
    {
       sid=id;
       sname=name;
       grad=gr;

    }
}
