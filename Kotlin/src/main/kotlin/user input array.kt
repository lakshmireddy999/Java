import java.util.*;
fun main()
{
    val arr=arrayOf("Lakshmi ","Reddy ")
    /*for( i in 0 until arr.size-1)
    {
        println("${arr[i]}")
    }*/
    for(i in arr.indices)
    {
        println(arr[i])
    }
    val sc=Scanner(System.`in`)
    val ar= Array<Int>(5,{0})
    println("Enter elements")
    for(i in ar.indices)
    {
        ar.set(i,sc.nextInt())
    }
    println("Array values")
    for(i in ar.indices)
    {
        println("${ar[i]}")
    }

}