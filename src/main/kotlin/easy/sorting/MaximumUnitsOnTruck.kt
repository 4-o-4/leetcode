package easy.sorting

import java.util.TreeMap

fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
    val map = TreeMap<Int, MutableList<Int>>(Comparator.reverseOrder())
    var tmp = truckSize
    var sum = 0

    for ((i1, i2) in boxTypes)
        map.compute(i2) { _, v -> v?.apply { add(i1) } ?: mutableListOf(i1) }
    for ((k, v) in map) {
        for (i in v) {
            if (tmp - i < 0) {
                sum += tmp * k
                return sum
            }
            tmp -= i
            sum += i * k
        }
    }
    return sum
}
