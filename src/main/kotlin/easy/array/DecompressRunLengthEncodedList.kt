package easy.array

fun decompressRLElist(nums: IntArray): IntArray {
    val list = mutableListOf<Int>()

    for (i in 0 until nums.lastIndex step 2) {
        repeat(nums[i]) {
            list.add(nums[i + 1])
        }
    }
    return list.toIntArray()
}
