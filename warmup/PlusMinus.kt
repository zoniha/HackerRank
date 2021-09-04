fun plusMinus(arr: Array<Int>, num: Double): Unit {
    // Write your code here
    var posi: Double = 0.0
    var nega: Double = 0.0
    var zero: Double = 0.0

    for(i in arr) {
        if(i > 0) {
            posi += 1
        } else if(i < 0) {
            nega += 1
        } else {
            zero += 1
        }
    }

    val posiAns: Double = posi / num
    val negaAns: Double = nega / num
    val zeroAns: Double = zero / num

    println(posiAns)
    println(negaAns)
    println(zeroAns)

}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val num: Double = n.toDouble()
    plusMinus(arr, num)
}
