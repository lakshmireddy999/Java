package basic;

import java.util.ArrayList;
public class AList {
    public static void main(String[] args) {
        ArrayList colors1=new ArrayList();
        colors1.add("blue");
        colors1.add("green");
        colors1.add("red");
        //for adding at 2nd location
        colors1.add(2);
        colors1.add(1,"violet");

        ArrayList colors2=new ArrayList();
        colors2.add("yellow");
        colors2.add("pink");

        System.out.println(colors1);

        //adding colors2 list to colors1 list
        colors1.addAll(colors2);
        //to delete colors1.clear
        System.out.println(colors1);
    }
}
