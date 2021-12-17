package faculty;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        int mat[][] = new int[10][10];
        int program = 8;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input matrix");

        for (int i = 0; i < program; i++) {
            for (int j = 0; j < program; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int count=0,max=0,pred=0;
        for (int i = 0; i < program; i++) {
            count=0;
            for (int j = 0; j < program; j++) {
                if (mat[i][j] == 1) {
                    count+=1;
                    mat[i][j] = 0;
                }
                else
                    mat[i][j]=1;
            }
            if(count > max)
            {
                max=count;
            }

        }
        System.out.println("maximum friends:"+max);

        for(int i=0; i<program; i++)
        {
            for(int j=0; j<program; j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}