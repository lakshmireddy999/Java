package basic;

interface Phone3
{
    void call();
    public abstract void message();
    static void draw()
    {
        System.out.println("draw");
    }
}

class AndroidPhone implements Phone3
{
    public void call() {
        System.out.println("Call");
    }
    public void message()
    {
        System.out.println("Message");
    }

}
public class Interface2 {
    public static void main(String[] args) {
        AndroidPhone ap=new AndroidPhone();
        ap.call();
        ap.message();
        Phone3.draw();
    }
}
