package basic;

import java.util.Scanner;

public class Ques {
    static double calculateInterest(int amt,double roi,int years)
    {
        double interest=(amt*roi*years)/100;
        return interest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount");
        int principal=sc.nextInt();
        assert principal>0:"Invalid amount";
        System.out.println("enter time in years");
        int years=sc.nextInt();
        assert years>0:"invalid time";
        System.out.println("enter rate of interest");
        double roi=sc.nextDouble();
        assert roi>0:"Invalid Rate of interest";

        double interest=calculateInterest(principal,roi,years);

        System.out.println("interest:"+interest);
    }
}
