package basic;

import java.util.Scanner;
class Fact {
    int fact(int n)
    {
        int f=1;
        if(n==0)
        {

            return 1;
        }
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }

        return f;

    }
    public static void main(String [] rk) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
      Fact obj=new Fact();
       int f=obj.fact(num);
        System.out.println("factorial is:"+f);

    }
}
