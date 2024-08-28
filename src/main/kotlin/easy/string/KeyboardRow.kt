package easy.string

fun findWords(words: Array<String>): Array<String> {
    val arr = mutableListOf<String>()
    val l1 = "qwertyuiop".toSet()
    val l2 = "asdfghjkl".toSet()
    val l3 = "zxcvbnm".toSet()

    for (word in words) {
        val w = word.lowercase()
        if (l1.containsAll(w.toSet()))
            arr.add(word)
        else if (l2.containsAll(w.toSet()))
            arr.add(word)
        else if (l3.containsAll(w.toSet()))
            arr.add(word)
    }
    return arr.toTypedArray()
}
