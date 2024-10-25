package easy.array

fun largestAltitude(gain: IntArray): Int {
    var max = 0
    var tmp = 0

    for (i in gain) {
        tmp += i
        if (tmp > max)
            max = tmp
    }
    return max
}
