package easy.string

import kotlin.math.abs

fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
    val arr1 = IntArray(26) { 0 }
    val arr2 = IntArray(26) { 0 }

    for (c in word1)
        arr1[c - 'a']++
    for (c in word2)
        arr2[c - 'a']++

    for (i in 0 until 26)
        if (abs(arr1[i] - arr2[i]) > 3)
            return false
    return true
}
