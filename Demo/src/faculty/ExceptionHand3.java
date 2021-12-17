package faculty;
import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHand3
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter marks in 5 subjects");
        try {
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
            int per=sum/5;
            System.out.println("Percentage obtained : "+per);
        }
        catch (InputMismatchException e)
        {
            System.out.println("only integers");
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Invalid array index");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(Throwable e)//generalized exception handler
        {
            System.out.println("generalized exception handler");
        }
        finally {
            System.out.println("This is a line displayed by finally block");
        }
        System.out.println("Thank you");

    }
}
