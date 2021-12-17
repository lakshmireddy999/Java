package faculty;

import java.util.Scanner;

public class ExceptionHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ae){
            System.out.println("Cannot divide by zero"+ ae.getMessage());
        }
        catch (Exception e)  //if others exceptions occurred other than we predicted
        {   //Generalised exception should be the last exception handler
            System.out.println("Generalised Exception"+e.getMessage());
        }
    }
}
