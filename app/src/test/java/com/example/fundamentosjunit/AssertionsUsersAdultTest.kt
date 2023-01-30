package com.example.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersAdultTest {
    private lateinit var bot: User
    private lateinit var juan: User

    @Before // Esto se va a ejecutar antes de cada prueba
    fun setup(){
        bot = User("8bit", 1, false)
        juan = User("Juan", 18, true)
    }

    @After
    fun tearDown(){
        bot = User()
        juan = User()
    }

    @Test
    fun isAdultTest() {
        val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))
    }
}