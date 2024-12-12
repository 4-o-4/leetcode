package easy.array

fun heightChecker(heights: IntArray): Int {
    var counter = 0

    val copy = heights.copyOf().also { it.sort() }
    for (i in copy.indices)
        if (copy[i] != heights[i])
            counter++
    return counter
}
