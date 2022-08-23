fun main(){
    /*----------------1 type------------*/
    val myarray1 = arrayOf(1,2,3,4)
    println(myarray1.contentToString())
    /*----------------1 type------------*/



    /*----------------2 type------------*/
    val myarray2= arrayOf<Int>(1,2,3,4,5)
    println(myarray2.contentToString())
    /*----------------2 type------------*/



    /*----------------3 type------------*/
    val myarray3= Array(5,{i -> i*1 })
    println(myarray3.contentToString())
    /*----------------3 type------------*/

    /*----------------4 type------------*/
    val myarray4 = intArrayOf(1, 2, 3, 4)
    println(myarray4.contentToString())
    /*----------------4 type------------*/

    /*----------------5 type------------*/
    val myarray5 =IntArray(5) { 10 * (it + 1) }
    println(myarray5.contentToString())
    /*----------------5 type------------*/

    /*----------------6 type------------*/
    val myarray6 = arrayOf(intArrayOf(1, 2),intArrayOf(3, 4),intArrayOf(5, 6))
    println(myarray6.contentDeepToString())
    /*----------------6 type------------*/



    /*------------------------------------------------------------------------------*/

    println("Please Enter The Array Values")
    println("size: ")
    val size= readLine()!!.toInt()
    val myarray7= arrayListOf<Int>()
    for (i in 0..size-1){
        println("a[$i] : ")
        myarray7.add(readLine()!!.toInt())

    }
    println("entered array is : ")
    println(myarray7.toString())
    println("************With Built-in Function*************")
    println("**********After sorting by built-in function**********")
    myarray7.sort()
    println(myarray7.toString())

    println("************without built-in function**********")
    println("***********After Sorting**********")
    var temp: Int
    for (i in 0..myarray7.size-1) {
        for (j in i+1..myarray7.size-1)
        {
            if (myarray7[i] > myarray7[j])
            {
                temp = myarray7[i]
                myarray7[i] = myarray7[j]
                myarray7[j] = temp
            }
        }
    }
    println(myarray7.toString())

    /*------------------------------------------------------------------------------*/


}