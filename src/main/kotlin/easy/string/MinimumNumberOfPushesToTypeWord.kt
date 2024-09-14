package easy.string

fun minimumPushes(word: String): Int {
    val map = mutableMapOf<Char, Int>()
    var i = 0
    var j = 0
    var k = 1

    for (c in word)
        map.compute(c) { _, v -> if (v == null) 1 else v + 1 }
    for ((_, value) in map) {
        j += k * value
        i++
        if (i == 8 * k)
            k++
    }
    return j
}
