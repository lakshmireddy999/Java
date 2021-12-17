import java.util.*;
fun main()
{
var a:Int=100
    var b:Byte=a.toByte()
    println(b)
    while(a>0)
    { 
        print("$a ")
        a-=10
    }
    println()
    for(i in 1..5)
    {
        print("$i ")
    }
    println()
    for(i in 1..10 step 2)
    {
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 step 2)
    {
        print("$i ")
    }
    println()
    println("Array printing")
    var arr= arrayOf(1,2,3,4,5)
    for(i in arr.indices)
    {
        print("${arr[i]} ")
    }
    println()
    var h="Hello World"
    for (i in h)
    {
        print("$i ")
    }
    println()
    println("using until keyword")
    for(i in 1 until 5)
    {
        print("$i ")
    }
    println()

}
