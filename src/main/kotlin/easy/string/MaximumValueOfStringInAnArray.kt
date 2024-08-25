package easy.string

fun maximumValue(strs: Array<String>): Int {
    return strs.map {
        var f = false
        for (c in it) {
            if (!c.isDigit()) {
                f = true
                break
            }
        }
        if (f)
            it.length
        else
            it.toInt()
    }.max()
}
