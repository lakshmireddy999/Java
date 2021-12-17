package basic;

enum EmployeeCat
{
    TEMPORARY,PERMANENT,ADHOC;
}
public class Enumeration {
    public static void main(String[] args) {
        for(EmployeeCat obj:EmployeeCat.values())
            System.out.println(obj);
    }
}
