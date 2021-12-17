package faculty;
import java.util.*;


public class ExceptionHand9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println(a/b);
        }
        catch (ArithmeticException|InputMismatchException ae)
        {
            if(ae instanceof ArithmeticException)
            {
                System.out.println("Cannot divide by zero");
            }
            else if(ae instanceof InputMismatchException)
            {
                System.out.println("Invalid input");
            }
        }
    }
}
