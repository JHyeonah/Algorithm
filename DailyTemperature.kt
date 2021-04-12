import java.util.*

// 하루 온도의 리스트가 있을 때, 각각의 날들에서 더 따뜻한 날이 되려면
// 며칠을 기다려야 하는지를 담은 리스트를 반환하여라 (미래에 따뜻한 날이 없을 시 0 반환)
fun main() {
    val nums = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    val res = dailyTemperatures(nums)

    for (i in res) {
        print("$i ")
    }
}

fun dailyTemperatures(temper: IntArray): IntArray {
    val stack = Stack<Int>()
    val result = IntArray(temper.size)

    for (i in temper.indices) {
        println("temper : ${temper[i]}")
        while (!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
            val index = stack.pop()
            println("i : $i, index : $index")
            result[index] = i-index
        }
        stack.push(i)
    }

    return result
}