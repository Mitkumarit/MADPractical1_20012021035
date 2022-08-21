fun main() {
    println("Enter the the number : ")
    val n = readLine()!!
    val factorial = fact(n.toInt())
    println("Factorial of $n = $factorial")
    println("Factorial of $n using tailrec function = $factorial")
}

fun fact(n: Int): Int {
    return if(n == 1){
        n
    }
    else{
        n*fact(n-1)
    }
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}