package ru.otus.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    fun calculationTest() {
        Assertions.assertEquals(
            "1 + 2 = 3 Огурцов",
            calculate(1, 2)
        )
    }

    @Test
    fun firstAtHomworkTest() {
        val result = firstAtHomwork(2, 3, 1)
        assertEquals(6, result)
    }

    @Test
    fun secondAtHomworkTest() {
        Assertions.assertEquals(
            "str1,str2,str3",
            secondAtHomwork("str1","str2","str3", chr = ',')
        )
    }
}