package DataStructures;

public class RandomMatrix {
    static int getIndex(String s)
    {
        return (int)(s.length()*Math.random());

    }
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        char [][]boggle=new char[4][4];

        for (int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                int index=getIndex(s);
                boggle[i][j]=s.charAt(index);
            }
        }

        for (int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(boggle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
