fun main(){
    println("enter the first number: ")
    val x= readLine()!!.toInt()
    println("enter the second number: ")
    val y= readLine()!!.toInt()
    val a=addnumber(x,y)
    val b=dividenumber(x,y)
    val c=mulnumber(x,y)
    val d=subnumber(x,y)
    println("the addition of the number is: $a")
    println("the division of the number is: $b")
    println("the multiplication of the number is: $c")
    println("the subtraction of the number is: $d")
}

fun addnumber(vararg strings:Int):Int
{
    var sum : Int=0
    for (i in strings){
        sum += i
    }
    return sum
}

fun dividenumber(x:Int,y:Int):Int
{
    return (x/y)
}

fun mulnumber(x:Int,y:Int):Int
{
    return (x*y)
}
fun subnumber(x:Int,y:Int):Int
{
    return (x-y)
}