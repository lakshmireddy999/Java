package basic;

import java.util.Scanner;

public class question
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the  products purchased");
        double price=sc.nextInt();

        char ch;
        do
        {
            System.out.println("Enter \n B or b for boys \n G or g for girls ");
            System.out.println("M or m for Men \n W or w for Women");
            ch=sc.next().charAt(0);
            ch=Character.toLowerCase(ch);
        }while(ch!='m' && ch!='w' && ch!='g' && ch!='b');

        switch(ch)
        {
            case 'b':
            {
                price=price-(price*0.2);
                break;
            }
            case 'g':
            {
                price=price-(price*0.4);
                break;
            }
            case 'm':
            {
                price=price-(price*0.3);
                break;
            }
            case 'w':
            {
                price=price-(price*0.45);
                break;
            }
            default:
            {
                System.out.println("Wrong choice...");
                break;
            }
        }
        System.out.println("Final price after discount is:"+price);
    }
}
