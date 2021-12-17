package basic;

class Bank
{
    int rateOfInterest()
    {
        return 0;
    }
}
class SBIBank extends Bank
{
    int rateOfInterest()//method overidding
    {
        return 7;
    }
}
class Overriding
{
    public static void main(String[] args) {
        SBIBank sb=new SBIBank();
        System.out.println("Calling rate of interest using Child reference: "+sb.rateOfInterest());//which class's rateOfInterest will be invoked
        Bank b=new Bank();
        System.out.println("Calling rate of interest using Parent reference: "+b.rateOfInterest());
    }
}

