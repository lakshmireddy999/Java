package faculty;
import java.util.Scanner;

class ExceptionHand4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        try {
            if (marks > 100)
                throw new ArithmeticException("Invalid Marks");
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }

    }
}