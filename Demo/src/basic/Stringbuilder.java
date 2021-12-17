package basic;

public class Stringbuilder {


        public static void main(String[] args) {

            StringBuilder sb1=new StringBuilder();//16
            System.out.println(sb1.capacity());

            StringBuilder sb2=new StringBuilder(10);//10
            System.out.println(sb2.capacity());

            StringBuilder sb3=new StringBuilder("Abcd");//20
            System.out.println(sb3.capacity());
            System.out.println(sb3.length());

            StringBuilder sb4=new StringBuilder('A');//65
            System.out.println(sb4.capacity());

            sb3.append("my roll no is 25 in the fourth sem");
            System.out.println(sb3);
            System.out.println(sb3.capacity());//new_capacity=2*old_capacity+2


        }
    }

