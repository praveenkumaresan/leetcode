package org.pachaiworld.fullofcode

import org.junit.Test
import kotlin.test.assertEquals

class MaximumSubArrayTest {

    @Test
    fun `get the max sum of sub array`(){
        val nums = intArrayOf(-1, 2, -4, 4, 10)
        val sum = maxSubArray(nums)
        assertEquals(14,sum)
    }
}