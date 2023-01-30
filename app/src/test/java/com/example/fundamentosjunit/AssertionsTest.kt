package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(21, 117) // valor esperado
        assertArrayEquals(array,assertions.getLuckyNumbers())
    }
}