package easy.string

fun countWords(words1: Array<String>, words2: Array<String>): Int {
    fun setWords(words: Array<String>): MutableSet<String> {
        val set = mutableSetOf<String>()
        val idx = mutableListOf<Int>()

        for ((i, value) in words.withIndex())
            if (!set.add(value))
                idx.add(i)
        for (i in idx)
            set.remove(words[i])
        return set
    }

    val setWords1 = setWords(words1)
    val setWords2 = setWords(words2)
    val counter = setWords1.size + setWords2.size
    setWords1.addAll(setWords2)
    return counter - setWords1.size
}
