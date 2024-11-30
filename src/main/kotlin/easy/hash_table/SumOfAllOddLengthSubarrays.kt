package easy.hash_table

fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum = arr.sum()
    if (arr.size < 3)
        return sum
    var length = arr.size
    if (length % 2 == 0)
        length -= 1
    while (length != 1) {
        var size = 1
        var tmp = 0
        for (i in arr.indices) {
            tmp += arr[i]
            if (size == length) {
                sum += tmp
                tmp -= arr[i - size + 1]
            } else
                size++
        }
        length -= 2
    }
    return sum
}
