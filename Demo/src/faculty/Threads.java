package faculty;
class A extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++) {
            System.out.println("A");
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("B");
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {
    A a=new A();
    //B b=new B();
    a.start();
    Thread th=new Thread(new B());
    th.start();
    }
}
