package easy.hash_table

fun countCharacters(words: Array<String>, chars: String): Int {
    val arr = IntArray(26)
    var counter = 0

    for (c in chars)
        arr[c - 'a']++
    for (word in words) {
        val tmp = mutableMapOf<Int, Int>()
        var tmpCounter = 0
        word.forEach { tmp.compute(it - 'a') { _, v -> v?.inc() ?: 1 } }
        for ((k, v) in tmp) {
            if (arr[k] < v)
                break
            tmpCounter++
        }
        if (tmp.size == tmpCounter)
            counter += word.length
    }
    return counter
}
