import java.util.*

class DevelopFunction {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var queue: Queue<Int> = LinkedList<Int>()

        for (i in progresses.indices) {
            val days = (100 - progresses[i]) / speeds[i]
            if ((100 - progresses[i]) % speeds[i] != 0) {
                queue.offer(days+1)
            } else {
                queue.offer(days)   
            }
        }

        while (!queue.isEmpty()) {
            var first = queue.poll()
            var count = 1

            while (!queue.isEmpty() && queue.peek() <= first) {
                count++
                queue.poll()
            } 

            answer.add(count)
        }
        return answer.toIntArray()
    }
}
