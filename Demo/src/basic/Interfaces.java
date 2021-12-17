package basic;

interface Phone
{
    void call();//public,abstract method
    abstract void message();
}
interface Phone2
{
    void call();
    void message();
    void capture();
}
public class Interfaces implements Phone,Phone2 { //multiple inheritence possible in interfaces
    public void call() //abstract methods from interfaces must be public
    {
        System.out.println("call");
    }
    public void message()
    {
        System.out.println("message");
    }
    public void capture()
    {
        System.out.println("capture");
    }


    public static void main(String[] args) {
        Interfaces i=new Interfaces();
        i.call();
        i.message();
        i.capture();
    }
}
