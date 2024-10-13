package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfEmployeesWhoMetTheTargetKtTest {
    @Test
    fun example1() {
        val hours = intArrayOf(0, 1, 2, 3, 4)
        val target = 2
        assertEquals(3, numberOfEmployeesWhoMetTarget(hours, target))
    }

    @Test
    fun example2() {
        val hours = intArrayOf(5, 1, 4, 2, 2)
        val target = 6
        assertEquals(0, numberOfEmployeesWhoMetTarget(hours, target))
    }

    @Test
    fun example3() {
        val hours = intArrayOf(98)
        val target = 5
        assertEquals(1, numberOfEmployeesWhoMetTarget(hours, target))
    }
}