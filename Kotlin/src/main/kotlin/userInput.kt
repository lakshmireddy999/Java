import java.util.*

fun main()
{
    println("Enter str")
    var str= readLine()!!  //by default readline considers user enter string,!! used to make sure user doesnot enter null value
    println("str to int:"+str.toInt())
    println("str to float:"+str.toFloat())

    var b=Scanner(System.`in`)
    println("Enter a")
    var a:Int=b.nextInt();

    println("Enter c")
    var c=b.nextInt()

    println("Sum of $a + $c:${a+c}")
/*
    println("enter x")
    var x= readLine()!!
    println("enter y")
    var y= readLine()!!
    var z=x+" "+y
    println(z)*/

    println("A to int "+'A'.toInt())

}