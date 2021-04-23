package com.example.hilt_example

import com.example.hilt_example.bowstuff.Calculator
import junit.framework.Assert.assertEquals
import org.junit.Test


internal class MyFirstJUnitJupiterTests {

    private val calculator: Calculator = Calculator()

    @Test
    fun addition() {
        assertEquals(2, calculator.add(1, 1))
    }
}