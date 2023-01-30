package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUsersTest {

    // Recomendaciones para variables en Testing

    private lateinit var bot: User
    private lateinit var juan: User


    @Before // Esto se va a ejecutar antes de cada prueba
    fun setup(){
        bot = User("8bit", 1, false)
        juan = User("Juan", 18, true)
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(juan)
    }
}