
// 배열 안의 0이 아닌 요소의 상대적인 순서를 유지하면서
// 0을 끝으로 이동시키는 함수 작성 (단, list 사용금지)

fun main() {
    moveZeros(arrayOf(0,3,2,0,8,5))
}

fun moveZeros(nums: Array<Int>) {
    var index = 0
    for (i in nums) {
        if (i != 0) {
            nums[index] = i
            index++
        }
    }

    while (index < nums.size) {
        nums[index] = 0
        index++
    }

    for (i in nums) {
        print("$i ")
    }
}