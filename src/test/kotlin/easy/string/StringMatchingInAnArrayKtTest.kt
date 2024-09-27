package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringMatchingInAnArrayKtTest {
    @Test
    fun example1() {
        val words = arrayOf("mass", "as", "hero", "superhero")
        assertEquals(listOf("as", "hero"), stringMatching(words))
    }

    @Test
    fun example2() {
        val words = arrayOf("leetcode", "et", "code")
        assertEquals(listOf("et", "code"), stringMatching(words))
    }

    @Test
    fun example3() {
        val words = arrayOf("blue", "green", "bu")
        assertEquals(emptyList<String>(), stringMatching(words))
    }

    @Test
    fun example4() {
        val words = arrayOf("leetcoder", "leetcode", "od", "hamlet", "am")
        assertEquals(listOf("leetcode", "od", "am"), stringMatching(words))
    }
}