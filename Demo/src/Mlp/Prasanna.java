package Mlp;

public class Prasanna {

    protected int add(int a, int b){

        return a+b;
    }

    public static void main(String[] args)
    {
        Prasanna obj1=new Prasanna();

        int x=obj1.add(3,4);
        System.out.println("Addition of two integers is : "+x);

    }
}
