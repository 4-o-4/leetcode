package easy.string

fun isPathCrossing(path: String): Boolean {
    var x = 0
    var y = 0
    val paths = mutableSetOf(x to y)

    for (c in path) {
        when (c) {
            'N' -> x--
            'S' -> x++
            'W' -> y--
            'E' -> y++
        }
        val pair = x to y
        if (pair in paths)
            return true
        paths.add(pair)
    }
    return false
}
