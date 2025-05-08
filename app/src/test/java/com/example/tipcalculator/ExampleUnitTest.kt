package com.example.tipcalculator

import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun calculate20PercentTip() {
        val amount = 20.00;
        val percent = 20.0;
        val expectedTip = NumberFormat.getCurrencyInstance().format(4)
        val actualTip = calculateTip(amount,percent,false)
        assertEquals(expectedTip, actualTip)
    }
}