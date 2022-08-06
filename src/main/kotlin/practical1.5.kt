fun main(){
    println("Enter the number: ")
    val x= readLine()!!.toInt()
    println(
        when (x) {
            1->{
                "january"
            }
            2->{
                "february"
            }
            3->{
                "march"
            }
            4->{
                "april"
            }
            5->{
                "may"
            }
            6->{
                "june"
            }
            7->{
                "july"
            }
            8->{
                "august"
            }
            9->{
                "september"
            }
            10->{
                "octomber"
            }
            11 -> {
                "november"
            }
            12 -> {
                "december"
            }
            else ->{
                "enter the proper number"
            }
    })
}