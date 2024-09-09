package easy.string

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class UncommonWordsFromTwoSentencesKtTest {
    @Test
    fun example1() {
        val s1 = "this apple is sweet"
        val s2 = "this apple is sour"
        assertArrayEquals(arrayOf("sweet", "sour"), uncommonFromSentences(s1, s2))
    }

    @Test
    fun example2() {
        val s1 = "apple apple"
        val s2 = "banana"
        assertArrayEquals(arrayOf("banana"), uncommonFromSentences(s1, s2))
    }
}