package CoreJava;
import java.util.*;
public class FindingElement {
    static void findOccurence(int a[],int x,int l)
    {
        ArrayList<Integer> ar=new ArrayList();
        for(int i=0; i<l; i++)
        {
            if(a[i]==x) ar.add(i);

        }
        System.out.println("First Occurrence Index:"+ar.get(0));
        System.out.println("Last Occurrence Index:"+ar.get(ar.size()-1));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements:");
        for(int i=0; i<l; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find its occurrences");
        int x=sc.nextInt();
        findOccurence(a,x,l);
    }
}
