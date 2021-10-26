import java.util.*
import kotlin.math.*

class DevelopFunction {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var queue: Queue<Int> = LinkedList<Int>()

        for (i in progresses.indices) {
            val days = ceil((100f - progresses[i]) / speeds[i]).toInt()
            queue.offer(days)    
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
