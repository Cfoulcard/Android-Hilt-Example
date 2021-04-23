package com.example.hilt_example

import com.example.hilt_example.bowstuff.Bow
import junit.framework.Assert.assertEquals
import org.junit.Test


internal class MainActivityTest() {

    private val bow: Bow = Bow()

    @Test
    fun getBow() {
        assertEquals(bow.arrowsLeft() == 7, bow.arrowsLeft() == 7)
    }
}