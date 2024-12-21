package easy.array

import kotlin.math.min

fun countGoodRectangles(rectangles: Array<IntArray>): Int {
    val list = mutableListOf<Int>()
    var counter = 1

    for ((l, w) in rectangles)
        list.add(min(l, w))
    list.sort()
    val tmp = list.last()
    for (i in list.lastIndex - 1 downTo 0) {
        if (list[i] == tmp)
            counter++
        else
            break
    }
    return counter
}
