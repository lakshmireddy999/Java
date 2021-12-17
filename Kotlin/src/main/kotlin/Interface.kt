interface First
{
    fun add(a:Int,b:Int=5)
    fun print()
    {
        println("this is an interface function")
    }
}
class A:First
{
    override fun add(a: Int, b: Int) {
        println("sum=${a+b}")

    }

    override fun print() {
        super.print()
        println("this method is overriden")
    }
}
fun main()
{
    val obj=A()
    obj.add(10)
    obj.print()
}