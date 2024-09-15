package easy.string

fun numberOfSpecialChars(word: String): Int {
    val chars = word.toSortedSet()
    var i = 0

    for (c in chars) {
        if (c.isLowerCase())
            break
        if (chars.contains(c.lowercaseChar()))
            i++
    }
    return i
}
