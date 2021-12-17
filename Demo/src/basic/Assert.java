package basic;

import java.util.Scanner;

public class Assert {
    String errorMessage()
    {
        return "Invalid age";
    }
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        Assert d=new Assert();
        //assert age>=18;
        assert age>=18:d.errorMessage();

        System.out.println("thank you");
    }
}
