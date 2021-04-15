import kotlin.math.max

// merge 가능한 좌표 merge 하여 리턴하기
fun main() {
    val in1 = Interval(2, 3)
    val in2 = Interval(2, 8)
    val in3 = Interval(8, 10)
    val in4 = Interval(15, 18)

    val intervals = ArrayList<Interval>()
    intervals.add(in2)
    intervals.add(in1)
    intervals.add(in3)
    intervals.add(in4)

    val list = merge(intervals)
    println(list)
}

fun merge(interval: ArrayList<Interval>): ArrayList<Interval> {
    if (interval.isEmpty()) return interval
    val result = ArrayList<Interval>()

    // sorting
    println("interval : $interval")
    interval.sortBy { it.start }
    println("interval after sort : $interval")

    var begin = interval[0] // 1, 3
    for (i in 1 until interval.size) {
        val current = interval[i]
        if (begin.end >= current.start) {
            begin.end = max(begin.end, current.end)
        } else {
            result.add(begin)
            begin = current
        }
    }

    if (!result.contains(begin)) {
        result.add(begin)
    }

    return result
}