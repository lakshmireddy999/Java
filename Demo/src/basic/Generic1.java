package basic;

public class Generic1 {
    static <T> void printarray(T []s)
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(s[i]);
        }

    }
     /*static void printarray(Object[] s) {
        for (int i = 0; i < 5; i++) {
            System.out.println(s[i]);
        }
        }*/

    public static void main(String[] args) {
        String colors[] = {"Red", "yellow", "green", "blue", "white"};
        Integer a[] = {1, 2, 3, 4, 5};
        Character c[] = {'a', 'e', 'i', 'o', 'u'};
        Double d[] = {1.2,2.3,3.4,4.5,5.6};
        printarray(colors);
        printarray(a);
        printarray(c);
        printarray(d);

    }
}
