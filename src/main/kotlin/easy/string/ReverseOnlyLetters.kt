package easy.string

fun reverseOnlyLetters(s: String): String {
    val chars = s.toMutableList()
    var j = chars.lastIndex
    var tmp = ' '

    for (i in 0..j) {
        if (chars[i].isLetter()) {
            for (k in j downTo i) {
                if (chars[k].isLetter()) {
                    tmp = chars[i]
                    chars[i] = chars[k]
                    chars[k] = tmp
                    j = k - 1
                    break
                }
            }
        }
    }
    return chars.joinToString(separator = "")
}
