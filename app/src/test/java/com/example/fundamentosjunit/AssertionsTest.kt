package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(321, 117) // valor esperado
        assertArrayEquals("Mensaje personalizado de error en testing", array,assertions.getLuckyNumbers())
    }
}