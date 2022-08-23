class Matrix(val matrixArray : Array<IntArray>, val noOfRow : Int, val noOfCol : Int){
    operator fun plus(matrix : Matrix) : Matrix {
        val matrixSum   = Array(noOfRow) { IntArray(noOfCol) }
        for(i in matrixSum.indices){
            for(j in matrixSum[i].indices){
                matrixSum[i][j]=matrixArray[i][j]+matrix.matrixArray[i][j]
            }
        }
        return Matrix(matrixSum,noOfRow,noOfCol)
    }
    operator fun minus(matrix : Matrix) : Matrix {
        val matrixMin   = Array(noOfRow) { IntArray(noOfCol) }
        for(i in matrixMin.indices){
            for(j in matrixMin[i].indices){
                matrixMin[i][j]=matrixArray[i][j]-matrix.matrixArray[i][j]
            }
        }
        return Matrix(matrixMin,noOfRow,noOfCol)
    }
    operator fun times(matrix : Matrix) : Matrix {
        val matrixMul   = Array(noOfRow) { IntArray(matrix.noOfCol) }
        for(i in matrixMul.indices){
            for(j in matrixMul[i].indices){
                for(k in matrix.matrixArray.indices)
                    matrixMul[i][j]=matrixMul[i][j] + (matrixArray[i][k] * matrix.matrixArray[k][j])
            }
        }
        return Matrix(matrixMul,noOfRow,noOfCol)
    }
    override fun toString(): String {
        var msg = "($noOfRow x $noOfCol Matrix)\n"
        for(i in matrixArray.indices){
            msg += "${matrixArray[i].contentToString().replace(",", "").replace("[", "").replace("]", "").trim()}\n"
        }
        return msg
    }
}
fun main() {
    println("VyasUmang_21012022059")

    val firstMatrix = Matrix(arrayOf(intArrayOf(6, -4, 8), intArrayOf(2, 5, 1)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(1, 2), intArrayOf(-5, 2), intArrayOf(2,2)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(5, 1), intArrayOf(7,2), intArrayOf(1, 8)), 3, 2)

    println("***************Addition***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")
    println("***************Subtraction***************")
    print("Matrix:1 ")
    print (secondMatrix1)
    print("Matrix:2 ")
    print (secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")
    println("***************Multiplication***************")
    print("Matrix:1 ")
    print (firstMatrix)
    print("Matrix:2 ")
    print (secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}