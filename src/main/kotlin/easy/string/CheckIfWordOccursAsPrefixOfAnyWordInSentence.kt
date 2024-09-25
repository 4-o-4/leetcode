package easy.string

fun isPrefixOfWord(sentence: String, searchWord: String): Int {
    val split = sentence.split(" ")

    for ((i, w) in split.withIndex()) {
        if (w.startsWith(searchWord))
            return i + 1
    }
    return -1
}
