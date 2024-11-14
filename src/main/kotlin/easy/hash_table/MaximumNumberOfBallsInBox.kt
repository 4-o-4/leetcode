package easy.hash_table

fun countBalls(lowLimit: Int, highLimit: Int): Int {
    val map = mutableMapOf<Int, Int>()
    var max = 0

    for (i in lowLimit..highLimit)
        map.compute(i.sum()) { _, v -> v?.inc() ?: 1 }
    map.forEach { (_, v) -> if (v > max) max = v }
    return max
}

fun Int.sum(): Int {
    var tmp = this
    var sum = 0

    do {
        sum += tmp % 10
        tmp /= 10
    } while (tmp > 0)
    return sum
}
