package basic;

import java.util.Scanner;
public class A1 {
        int n;
        void deletion(int b[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Employee ID to be removed");
            int key=sc.nextInt();
            int keyi=-1;
            int i;
            for(i=0;i<n;i++)
            {
                if(b[i]==key)
                {
                    keyi=i;
                }
            }
            if(keyi==-1)
            {
                System.out.println("Employee ID does not exist!!!");
                return;
            }
            else
            {
                for(i=keyi;i<n-2;i++)
                {
                    b[i]=b[i+1];
                }
            }
            n=n-1;
            System.out.println("Employee Removed!!");
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int id[]=new int[20];
            System.out.println("How many employees");
            A1 d=new A1();
            d.n=sc.nextInt();

            System.out.println("Enter IDs");
            int i;
            for(i=0;i<d.n;i++)
            {
                id[i]=sc.nextInt();
            }

            d.deletion(id);


        }

}
