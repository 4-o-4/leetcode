package easy.string

fun countPrefixSuffixPairs(words: Array<String>): Int {
    var counter = 0

    for (i in 0 until words.lastIndex) {
        val k = i + 1
        for (j in k..words.lastIndex) {
            if (words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                counter++
        }
    }
    return counter
}
