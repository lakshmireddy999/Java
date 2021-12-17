package basic;

public class Label_break
{
    public static void main(String []args)
    {
        label1:for(int i=0;i<5; i++)
        {
            label2:for(int j=0; j<5; j++)
            {
                System.out.print("*");
                if(i==j)
                    break label2;
            }
            System.out.println("");
        }
    }
}