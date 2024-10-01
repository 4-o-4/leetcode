package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CircularSentenceKtTest {
    @Test
    fun example1() {
        val sentence = "leetcode exercises sound delightful"
        assertTrue(isCircularSentence(sentence))
    }

    @Test
    fun example2() {
        val sentence = "eetcode"
        assertTrue(isCircularSentence(sentence))
    }

    @Test
    fun example3() {
        val sentence = "Leetcode is cool"
        assertFalse(isCircularSentence(sentence))
    }

    @Test
    fun example4() {
        val sentence = "Leetcode eisc cool"
        assertFalse(isCircularSentence(sentence))
    }
}