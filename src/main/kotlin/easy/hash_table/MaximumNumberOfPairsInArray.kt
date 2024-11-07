package easy.hash_table

fun numberOfPairs(nums: IntArray): IntArray {
    val arr = IntArray(101)
    var pair = 0
    var counter = 0

    for (n in nums)
        arr[n]++
    for (n in arr) {
        if (n != 0) {
            if (n % 2 != 0)
                counter++
            pair += n / 2
        }
    }
    return intArrayOf(pair, counter)
}
