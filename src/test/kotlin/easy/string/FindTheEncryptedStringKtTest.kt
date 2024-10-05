package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheEncryptedStringKtTest {
    @Test
    fun example1() {
        val s = "dart"
        val k = 3
        assertEquals("tdar", getEncryptedString(s, k))
    }

    @Test
    fun example2() {
        val s = "aaa"
        val k = 1
        assertEquals("aaa", getEncryptedString(s, k))
    }

    @Test
    fun example3() {
        val s = "dart"
        val k = 5
        assertEquals("artd", getEncryptedString(s, k))
    }
}