package faculty;
import java.util.Scanner;
class MyException extends Throwable
{
    void errorMessage()
    {
        System.out.println("Invalid Marks");
    }
}
class Student
{
    void validateMarks(int n) throws MyException
    {
        if(n>100)
            throw new MyException();
        else
            System.out.println("Marks are valid");
    }
}
public class ExceptionHand8 {
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        try{
            s.validateMarks(m);
        }
        catch (MyException e)
        {
            e.errorMessage();
        }
    }
}
