package easy.string

fun numberOfLines(widths: IntArray, s: String): IntArray {
    val ints = mutableListOf<Int>()
    var width = 0

    for (c in s) {
        width += widths[c - 'a']
        if (width > 100) {
            ints.add(width)
            width = widths[c - 'a']
        }
    }
    return intArrayOf(ints.size + 1, width)
}