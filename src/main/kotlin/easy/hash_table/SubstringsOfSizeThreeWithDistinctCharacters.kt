package easy.hash_table

import java.util.LinkedList

fun countGoodSubstrings(s: String): Int {
    if (s.length <= 3)
        return if (s.toSet().size == 3) 1 else 0

    val chars = LinkedList<Char>()
    var counter = 0
    for (i in 0..2)
        chars.add(s[i])
    if (chars.toSet().size == 3) counter++
    for (i in 3..s.lastIndex) {
        chars.removeFirst()
        chars.add(s[i])
        if (chars.toSet().size == 3) counter++
    }
    return counter
}
