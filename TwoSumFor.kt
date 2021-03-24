// 배열의 두개를 뽑아 더하여 target을 만드는 문제
// 단, 같은 수를 다시 더할 수 없고, 정답은 nums 배열의 인덱스+1 를 담은 IntArray를 리턴한다

fun main() {
    val sumArray = twoSum(intArrayOf(2,8,11,14), 25)
    for (i in sumArray) {
        print("$i ")
    }
}

// 이중for문으로 쉽게 구현 가능하지만,
// 시간복잡도가 커져(n의 제곱) 데이터에 한번 접근하여 구하기 위한 Map을 사용해야 한다
fun twoSum(nums: IntArray, target: Int): IntArray {
    val resultArray: IntArray = IntArray(2)
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i < j) {
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i + 1
                    resultArray[1] = j + 1
                }
            }
        }
    }
    return resultArray
}