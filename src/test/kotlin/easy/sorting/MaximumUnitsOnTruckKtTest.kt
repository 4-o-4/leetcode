package easy.sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumUnitsOnTruckKtTest {
    @Test
    fun example1() {
        val boxTypes = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1))
        val truckSize = 4
        assertEquals(8, maximumUnits(boxTypes, truckSize))
    }

    @Test
    fun example2() {
        val boxTypes = arrayOf(intArrayOf(5, 10), intArrayOf(2, 5), intArrayOf(4, 7), intArrayOf(3, 9))
        val truckSize = 10
        assertEquals(91, maximumUnits(boxTypes, truckSize))
    }
}