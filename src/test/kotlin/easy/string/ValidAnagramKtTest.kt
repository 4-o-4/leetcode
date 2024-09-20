package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidAnagramKtTest {
    @Test
    fun example1() {
        val s = "anagram"
        val t = "nagaram"
        assertTrue(isAnagram(s, t))
    }

    @Test
    fun example2() {
        val s = "rat"
        val t = "car"
        assertFalse(isAnagram(s, t))
    }
}