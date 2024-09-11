package easy.string

fun makeEqual(words: Array<String>): Boolean {
    val arrayOf = IntArray(26) { 0 }

    for (word in words)
        for (c in word)
            arrayOf[c - 'a']++
    for (c in arrayOf)
        if (c != 0)
            if (c % words.size != 0)
                return false
    return true
}
