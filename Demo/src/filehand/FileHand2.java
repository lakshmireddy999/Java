package filehand;

import java.io.*;
//printing all files in the path
class FileHand2
{
    public static void main(String[] args) {

        File f2=new File("C:\\Users\\Lakshmi Reddy\\IdeaProjects\\Demo");
        File[] f=f2.listFiles();

        for(int i=0;i<f.length;i++)
        {
            if(f[i].isFile())//for printing only files
            System.out.println(f[i].getName());
        }
    }
}
