package faculty;

class Employee
{
    String name;//instance variable

    static class Personaldetails
    {
        final static int x=0; //inside static variable should be final
        static void updatedetails()
        {
            Employee e = new Employee();
            e.name = "Lakshmi";
            System.out.println(e.name);
        }
    }
    void fun()
    {
        Personaldetails p=new Personaldetails();
        p.updatedetails();;
    }
}
public class NestedClass {
    public static void main(String[] args) {
        //Employee.Personaldetails p=new Employee.Personaldetails();
        //p.updatedetails();
        Employee e= new Employee();

        Employee.Personaldetails p=new Employee.Personaldetails();
        p.updatedetails();
    }
}
