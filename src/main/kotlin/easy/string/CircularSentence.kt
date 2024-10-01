package easy.string

fun isCircularSentence(sentence: String): Boolean {
    if (sentence[0] != sentence[sentence.lastIndex])
        return false
    for ((i, c) in sentence.withIndex())
        if (c == ' ' && sentence[i - 1] != sentence[i + 1])
            return false
    return true
}
