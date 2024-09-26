package easy.string

import kotlin.math.pow

fun titleToNumber(columnTitle: String): Int {
    var counter = 0

    for ((k, i) in (columnTitle.lastIndex downTo 0).withIndex()) {
        val j = columnTitle[i] - 'A' + 1
        counter += if (k == 0) j else j * 26.0.pow(k).toInt()
    }
    return counter
}
