package faculty;

class Display
{
    void show()
    {
        System.out.println("show");
    }
}
class child extends Display
{
    void show()
    {
        System.out.println("child show");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Display d=new Display()  //Anonymous class
        {
            @Override
            void show() {
                super.show();
                System.out.println("Anonymous show");
            }
        };
        d.show();
    }
}
