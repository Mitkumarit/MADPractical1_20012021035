fun main(){
    val x:Int=10
    val y:Double=x.toDouble()
    val z: String=x.toString()
    val a:Int=z.toInt()
    val f:String="11.23"
    val b:Double=f.toDouble()
    println("Integer value: $x")
    println("Double value (From Integer): $y")
    println("String value: $z")
    println("Integer value1 (From String): $a")
    println("Double value (from String: $b")
}