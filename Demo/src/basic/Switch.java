package basic;

import java.util.Scanner;



class Switch
{
    public static void main(String args[]) {
//movie ticket booking
//Prime tickets
//(1-5) 150 each
//(6-10) first 5 will be chargeable at 150 each, rest at 100 each
//10+ 100 each
//Classic tickets
//140 each
        int price=0;
        Scanner sc=new Scanner(System.in);
        int num;
        char ch;
        do {
            System.out.println("How many tickets");
            num = sc.nextInt();
        }while(num<=0);
        do {
            System.out.println("Press p or P for prime, or press c or C for Classic : ");
            ch=sc.next().charAt(0);
            ch=Character.toLowerCase(ch);
        }while(ch!='p' && ch!='c');


        switch (ch)
        {
            case 'p':
                if(num>=1 && num<=5)
                {
                    price=150*num;
                }
                else if(num>5&&num<=10)
                {
                    price=(5*150)+(num-5)*100;
                }
                else if(num>10)
                {
                    price=num*100;
                }
                else
                {
                    price=0;
                }
                break;
            case 'c':
                if(num>=1)
                {
                    price=num*140;
                }
                else
                    price=0;
                break;
            default:
                System.out.println("Invalid selection");
        }


        System.out.println("Price : "+price);
    }
}
