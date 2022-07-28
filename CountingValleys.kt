fun countingValleys(steps: Int, path: String): Int {
var preCount = 0
var count = 0
var valley = 0

val itChar = path.toCharArray()
   for (x in 0 until steps.length) {
        if (itChar[x] == 'U') {
            count++
        } else if (itChar[x] == 'D') {
            count--
        }
        if (count == 0 && preCount < count) {
            valley++
        }
        preCount = count
   }
   return valley
}
