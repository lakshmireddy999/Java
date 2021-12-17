import java.util.*
class calc
{
    var a:Int = 0
    var b:Int=0

    fun calci(x:Int,y:Int)
    {
        a=x
        b=y
        sum()
    }
    fun sum()
    {
        println("sum ${(a+b)}")
    }
    fun cat(x:String,y:String):String
    {
        return (x+" "+y)
    }

}
fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter a and b")
    var a=sc.nextInt()
    var b=sc.nextInt()
    var obj=calc()
    obj.calci(a,b)

    println("Enter two strings")
    var s1=sc.next();
    var s2=sc.next();
    var str=obj.cat(s1,s2)
    println(str)
}