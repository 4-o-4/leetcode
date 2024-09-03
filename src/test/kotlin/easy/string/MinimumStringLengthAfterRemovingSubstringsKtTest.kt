package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumStringLengthAfterRemovingSubstringsKtTest {
    @Test
    fun example1() {
        val s = "ABFCACDB"
        assertEquals(2, minLength(s))
    }

    @Test
    fun example2() {
        val s = "ACBBD"
        assertEquals(5, minLength(s))
    }
}