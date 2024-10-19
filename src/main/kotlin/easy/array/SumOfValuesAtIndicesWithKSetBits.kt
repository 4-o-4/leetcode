package easy.array

fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
    var counter = 0
    var sum = 0

    for ((i, n) in nums.withIndex()) {
        val binary = Integer.toBinaryString(i)
        for (c in binary) {
            if (c == '1') {
                counter++
                if (counter > k)
                    break
            }
        }
        if (counter == k)
            sum += n
        counter = 0
    }
    return sum
}
