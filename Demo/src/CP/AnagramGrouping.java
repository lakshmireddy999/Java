package CP;
import java.util.*;
public class AnagramGrouping {
    static String  sort(String s)
    {
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String s2=new String(c);
        return s2;
    }
    public static void main(String[] args) {
        Map<String,ArrayList<String>>mp=new HashMap<>();
        String s[]={"ant","eat","ate","nat","tan","bat"};

        for(int i=0; i<s.length; i++)
        {
            String temp=sort(s[i]);
            ArrayList<String>ll=new ArrayList<>();
            if(!mp.containsKey(temp))
            {
                ll.add(temp);
                mp.put(temp,ll);
            }
            else
            {
                ll=mp.get(temp);
                ll.add(s[i]);
                mp.put(temp,ll);
            }
        }
        System.out.println(mp);

        List<ArrayList<String>> ar=new ArrayList<>();
        for(String str:mp.keySet())
        {
            ArrayList<String> arr=new ArrayList();
            arr=mp.get(str);
            ar.add(arr);
        }
        System.out.println(ar);
    }
}
