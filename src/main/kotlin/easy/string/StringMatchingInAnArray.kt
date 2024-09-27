package easy.string

fun stringMatching(words: Array<String>): List<String> {
    val set = mutableSetOf<String>()

    for ((i, w) in words.withIndex()) {
        for (j in i + 1..words.lastIndex) {
            if (w.length < words[j].length) {
                if (words[j].contains(w))
                    set.add(w)
            } else {
                if (w.contains(words[j]))
                    set.add(words[j])
            }
        }
    }
    return set.toList()
}
