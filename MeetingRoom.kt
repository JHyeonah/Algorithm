class MeetingRoom {
   fun main() {
        val in1 = Interval(7, 10)
        val in2 = Interval(2, 4)
        val in3 = Interval(0, 30)
        val intervals = arrayOf(in1, in2, in3)
        println(solve(intervals))
    }

    private fun solve(intervals: Array<Interval>): Boolean {
        if (intervals.isEmpty()) return false

        intervals.sortBy { it.start }

        println("interval size: ${intervals.size}")
        
        for (i in 1 until intervals.size) {
            if (intervals[i-1].end > intervals[i].start) {
                return false
            }
        }

        return true
    }

    fun print(intervals: Array<Interval>) {
        for (i in intervals) {
            println(i.start.toString() + " " + i.end.toString())
        }
    }
}

data class Interval(val start: Int, val end: Int)