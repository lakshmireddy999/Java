package basic;
import java.util.*;

public class Collection9 {
    public static void main(String[] args) {
        Map<String,String > pb=new HashMap();
        pb.put("lakshmi","6302599262");
        pb.put("nana","949085006");
        pb.put("home","9494503806");
        System.out.println(pb);
        System.out.println(pb.get("lakshmi"));
        Set<String>keys=pb.keySet();
        System.out.println(keys);
        for(String i:keys)
        {
            if(i.equals("john")){}
            else
                System.out.println(i+" "+pb.get(i));
        }
    }
}
