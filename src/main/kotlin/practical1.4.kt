fun main(){
    println("Enter the number you want: ")
    val x= readLine()!!.toInt()

    if( x % 2 == 0){
        println("$x is even")
    }
    else
        println("$x is odd")
}