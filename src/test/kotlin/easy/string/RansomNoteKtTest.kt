package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RansomNoteKtTest {
    @Test
    fun example1() {
        val ransomNote = "a"
        val magazine = "b"
        assertFalse(canConstruct(ransomNote, magazine))
    }

    @Test
    fun example2() {
        val ransomNote = "aa"
        val magazine = "ab"
        assertFalse(canConstruct(ransomNote, magazine))
    }

    @Test
    fun example3() {
        val ransomNote = "aa"
        val magazine = "aab"
        assertTrue(canConstruct(ransomNote, magazine))
    }
}