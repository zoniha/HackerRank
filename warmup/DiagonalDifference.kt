import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>, size: Int): Int {
    var sum1: Int = 0
    var sum2: Int = 0

    for(i in 0..size) {
        sum1 += arr[i][i]
        sum2 += arr[i][size-i]
    }

    val result: Int = abs(sum1 - sum2)

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val size = n - 1

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr, size)

    println(result)
}
