class Solution {
    var answer = mutableListOf<IntArray>()
    fun solution(n: Int): Array<IntArray> {
         moveTower(n, 1, 2, 3)

         return answer.toTypedArray()
    }

    fun moveTower(n: Int, from: Int, pass: Int, to: Int) {
        if (n == 1) {
            answer.add(intArrayOf(from, to))
            return
        } else {
            moveTower(n-1, from, to, pass)
            answer.add(intArrayOf(from, to))
            moveTower(n-1, pass, from, to)
        }
    }
}
