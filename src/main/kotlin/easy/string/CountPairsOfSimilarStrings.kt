package easy.string

fun similarPairs(words: Array<String>): Int {
    var counter = 0

    for ((i, value) in words.withIndex()) {
        val word = value.toSet()
        for (j in i + 1..words.lastIndex) {
            val word2 = words[j].toSet()
            if (word.size == word2.size && word.containsAll(word2))
                counter++
        }
    }
    return counter
}
