package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCommonWordsWithOneOccurrenceKtTest {
    @Test
    fun example1() {
        val words1 = arrayOf("leetcode", "is", "amazing", "as", "is")
        val words2 = arrayOf("amazing", "leetcode", "is")
        assertEquals(2, countWords(words1, words2))
    }

    @Test
    fun example2() {
        val words1 = arrayOf("b", "bb", "bbb")
        val words2 = arrayOf("a", "aa", "aaa")
        assertEquals(0, countWords(words1, words2))
    }

    @Test
    fun example3() {
        val words1 = arrayOf("a", "ab")
        val words2 = arrayOf("a", "a", "a", "ab")
        assertEquals(1, countWords(words1, words2))
    }
}