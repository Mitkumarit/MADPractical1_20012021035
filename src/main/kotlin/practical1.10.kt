class Car(type:String, model:String, price:Int, owner:String, miles:Int){
    var typee:String = type
    var modell =model
    var pricee:Int = price
    var ownerr = owner
    var miless:Int = miles
    fun getCarInfo() {
        println("Selling Price of Car: " + (pricee - miless).toString() + "rs")
        println("Actual price: " + pricee.toString() + "rs")
        println("Total Kms: $miless")
        println("car model:$modell")
        println("car owner: $ownerr")
        println("car miles: $miless")
        println()

    }
    fun getOriginalCarPrice() {
        println("Actual price: " + pricee.toString() + "rs")
        println()

    }
}
fun main() {
    println("VyasUmang_21012022059")
    var c1 = Car("SUV", "FORTUNER", 125000, "Umang", 10000)
    c1.getCarInfo()
    var c2 = Car(" SUV", "NEXON", 100000, "Vyas", 50000)
    c2.getCarInfo()
    println("*************************")
    c1.getOriginalCarPrice()
    c2.getOriginalCarPrice()
} 