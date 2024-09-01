package easy.string

fun areNumbersAscending(s: String): Boolean {
    val split = s.split(" ")
    var max = 0

    for (word in split.iterator()) {
        var f = true
        for (c in word) {
            if (!c.isDigit()) {
                f = false
                break
            }
        }
        if (f) {
            if (word.toInt() > max)
                max = word.toInt()
            else
                return false
        }
    }
    return true
}
