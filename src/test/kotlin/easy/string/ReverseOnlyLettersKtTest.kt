package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseOnlyLettersKtTest {
    @Test
    fun example1() {
        val s = "ab-cd"
        assertEquals("dc-ba", reverseOnlyLetters(s))
    }

    @Test
    fun example2() {
        val s = "a-bC-dEf-ghIj"
        assertEquals("j-Ih-gfE-dCba", reverseOnlyLetters(s))
    }

    @Test
    fun example3() {
        val s = "Test1ng-Leet=code-Q!"
        assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters(s))
    }
}