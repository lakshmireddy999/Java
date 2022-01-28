package CP;

import java.util.*;

public class TriangleFormation {
    public static void main(String[] args) {
        int a[]={3,6,2,3,5};

        Arrays.sort(a);
        int n=a.length;
        for(int i=n-1; i>=2; i--)
        {
            if(a[i-1]+a[i-2]>a[i])
            {
                int perimeter=a[i]+a[i-1]+a[i-2];
                System.out.println("perimeter:"+perimeter);
                break;
            }
        }
    }
}
