import kotlin.system.exitProcess

/*Data types re not primitive, they are objects of wrapper class type
so having first letter capital
*Byte
*Short
*Int
*Long
*Float
*Double
*Boolean
*Char

 */
fun main()
{
    val x=5
    val y=90
    println("my integer $x")
    println("my integer ${y+6}")

    var b1=Byte.MIN_VALUE
    var b2=Byte.MAX_VALUE
    println("min byte value:"+b1)
    println("max byte value:"+b2)

    var s1=Short.MIN_VALUE
    var s2=Short.MAX_VALUE
    println("min Short value:"+s1)
    println("Max Short value $s2")

    var i1=Int.MIN_VALUE
    var i2=Int.MAX_VALUE
    println("min Int value $i1")
    println("max int value $i2")

    var ch='v'
    println("my character $ch")
}