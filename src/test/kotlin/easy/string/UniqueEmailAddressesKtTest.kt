package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueEmailAddressesKtTest {
    @Test
    fun example1() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        )
        assertEquals(2, numUniqueEmails(emails))
    }

    @Test
    fun example2() {
        val emails = arrayOf("a@leetcode.com", "b@leetcode.com", "c@leetcode.com")
        assertEquals(3, numUniqueEmails(emails))
    }
}