package basic;

class Abc
{
    static Abc obj=new Abc();
    private Abc()
    {

    }
    public static Abc getInstance()
    {
        return obj;
    }
}
class Singleton
{
    public static void main(String args[]) {
        Abc a=Abc.getInstance();
    }

}


