package org.pachaiworld.fullofcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberPalindromeTest {

    @Test
    fun `get a number is palindrome or not `(){
        assertEquals(true, checkPalindrome(1111))
        assertEquals(false, checkPalindrome(123))
    }
}