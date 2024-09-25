package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfWordOccursAsPrefixOfAnyWordInSentenceKtTest {
    @Test
    fun example1() {
        val sentence = "i love eating burger"
        val searchWord = "burg"
        assertEquals(4, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun example2() {
        val sentence = "this problem is an easy problem"
        val searchWord = "pro"
        assertEquals(2, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun example3() {
        val sentence = "i am tired"
        val searchWord = "you"
        assertEquals(-1, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun example4() {
        val sentence = "hellohello hellohellohello"
        val searchWord = "ell"
        assertEquals(-1, isPrefixOfWord(sentence, searchWord))
    }

    @Test
    fun example5() {
        val sentence = "pillow love winstontang i pillow corona you errichto love"
        val searchWord = "i"
        assertEquals(4, isPrefixOfWord(sentence, searchWord))
    }
}