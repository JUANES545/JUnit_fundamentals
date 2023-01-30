package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(321, 117) // valor esperado
        assertArrayEquals("Mensaje personalizado de error en testing", array,assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Juanes"
        val otherName = "James"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val bot = User("8bit", 1, false)
        val juan = User("Juan", 18, true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))

    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest(){
        val juan = User("Juan", 18, true)
        assertNotNull(juan)
    }

    @Test
    fun checkNotSameUsersTest(){
        val bot = User("8bit", 1, false)
        val juan = User("Juan", 18, true)
        assertNotSame(bot, juan)
    }
    @Test
    fun checkSameUsersTest(){ // No son el mismo objeto
        val bot = User("juan", 18, true)
        val juan = User("Juan", 18, true)
        val copyJuan = juan
        assertSame(copyJuan, juan)
    }

    @Test(timeout = 1_000)
    fun getCitiesTest(){ // Espera x tiempo para ejecutar la prueba
        val cities = arrayOf("México", "Perú", "Argentina")
        //Thread.sleep(Random.nextLong(200, 1100))
        Thread.sleep(Random.nextLong(950, 1_050))
        assertEquals(3, cities.size)
    }

}