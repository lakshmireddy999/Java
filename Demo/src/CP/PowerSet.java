package CP;

import java.util.*;

public class PowerSet {
    static List<List<Integer>> powerset(int []nums)
    {
        List<List<Integer>>ans=new ArrayList<>();
        int n= nums.length;
        for(int i=(int)Math.pow(2,n); i<(int)Math.pow(2,n+1); i++)
        {
            String bitmask=Integer.toBinaryString(i).substring(1);

            List<Integer>curr=new ArrayList<>();
            for(int j=0; j<n; j++)
            {
                if(bitmask.charAt(j)=='1')
                    curr.add(nums[j]);
            }
            ans.add(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};

        List<List<Integer>> ar=powerset(nums);
        System.out.println(ar);
    }
}
