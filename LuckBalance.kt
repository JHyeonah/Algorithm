fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val important = ArrayList<Int>()
    var max = 0
    
    for (i in 0 until contests.size) {
        if (contests[i][1] == 1) {
            important.add(contests[i][0])
        } else {
            max += contests[i][0]
        }
    }
    
    Collections.sort(important)
    val loseCount = important.size - k
    
    for (i in 0 until important.size) {
        if (i < loseCount) {
            max -= important[i]
        } else {
            max += important[i]
        }
    }
    
    return max
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val contests = Array<Array<Int>>(n, { Array<Int>(2, { 0 }) })

    for (i in 0 until n) {
        contests[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = luckBalance(k, contests)

    println(result)
}
