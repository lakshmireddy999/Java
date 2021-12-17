package basic;
class Maximum
{
    <T extends Comparable> T maximum(T x,T y,T z)
    {
        T max=x;
        if(y.compareTo(max)>0)
        {
            max=y;
        }
        if(z.compareTo(max)>0)
        {
            max=z;
        }
        return max;
    }
}
class Generic6
{
    public static void main(String[] args) {

        Maximum m=new Maximum();
        System.out.println(m.maximum(4,3,2));
        System.out.println(m.maximum('s','u','n'));
        System.out.println(m.maximum(3.14,3.22,3.10));
    }
}
