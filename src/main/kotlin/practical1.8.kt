fun main(){
    /*----------------1 type------------*/
    val myarray1 = arrayOf(9,6,7,6,7,8)
    println(myarray1.contentDeepToString())

    /*--------------- 2 type -----------*/
    val myarray2 = ArrayList<String>()
    myarray2.add("5")
    myarray2.add("4")
    myarray2.add("2")
    myarray2.add("7")
    myarray2.add("9")
    println(myarray2)

    /*--------------- 3 type -----------

    val myarray3:(String,String,String,String)-> String={}
    val array=myarray3("meet","jay","radhe","shyam")

    --------------- 4 type -----------*/

    val arr4 = IntArray(5) { 1 }
    println(arr4.contentToString())

    /*--------------- 5 type -----------*/
    var arr5: IntArray = intArrayOf(5,10,20,12,15)
    println(arr5.contentToString())

    /*--------------- 5 type -----------*/
    var arr = arrayOf(intArrayOf(1, 2), intArrayOf(4, 5), intArrayOf(7, 8))
    for(i in arr){
        println(i.contentToString())
    }











    println("enter the array value:")
    println("a[0]:")
    val val1= readLine()!!
    println("a[1]:")
    val val2= readLine()!!
    println("a[2]:")
    val val3= readLine()!!
    println("a[3]:")
    val val4= readLine()!!
    println("a[4]:")
    val val5= readLine()!!

    val myarray = arrayOf("$val1","$val2","$val3","$val4","$val5")
    println(myarray.contentDeepToString())

    var largest = myarray[0]

    for (num in myarray) {
        if (largest < num)
            largest = num
    }
    println(largest)

}