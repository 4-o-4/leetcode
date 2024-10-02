package easy.string

fun romanToInt(s: String): Int {
    var max = 0
    var tmp = 0
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    for (c in s) {
        val i = map[c]!!
        max += when {
            tmp >= i -> i
            else -> i - tmp * 2
        }
        tmp = i
    }
    return max
}
