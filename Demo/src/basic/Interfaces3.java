package basic;
//anonymous class
//anonymous method
@FunctionalInterface
interface Display
{
    void show();
}
/*class DisplayClass implements Display
{
public void show()
{
System.out.println("Show");
}
}*/
public class Interfaces3 {
    public static void main(String[] args) {
        /*Display d=new Display() {//anonymous class
            @Override
            public void show() {
                System.out.println("Show");
            }
        };
        d.show();*/
        Display d=() -> {//anonymous method 0r lambda expression
            System.out.println("Show");

        };
        d.show();
    }
}
