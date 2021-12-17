package basic;

public class Continue {

        public static void main (String[]args)
        {

            label1:for (int i = 0; i < 5; i++)
            {
                System.out.println (i);
                for (int j = 0; j < 5; j++)
                {
                    if(j==2)
                        break label1;
                    System.out.println(j);
                }
            }
        }
    }
