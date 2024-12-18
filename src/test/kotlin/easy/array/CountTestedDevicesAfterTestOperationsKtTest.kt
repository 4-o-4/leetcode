package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTestedDevicesAfterTestOperationsKtTest {
    @Test
    fun example1() {
        val batteryPercentages = intArrayOf(1, 1, 2, 1, 3)
        assertEquals(3, countTestedDevices(batteryPercentages))
    }

    @Test
    fun example2() {
        val batteryPercentages = intArrayOf(0, 1, 2)
        assertEquals(2, countTestedDevices(batteryPercentages))
    }
}