package com.example.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUsersTest {

    // Recomendaciones para variables en Testing

    private lateinit var bot: User

    companion object{
        private lateinit var juan: User
        @BeforeClass @JvmStatic
        fun setupCommon(){
            juan = User("Juan", 18, true)
            println("BeforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            juan = User()
            println("AfterClass")
        }
    }

    @Before // Esto se va a ejecutar antes de cada prueba
    fun setup(){
        bot = User("8bit", 1, false)
        juan = User("Juan", 18, true)
        println("Before")
    }

    @After
    fun tearDown(){
        bot = User()
        juan = User()
        println("After")
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHumanTest")
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(juan)
        println("checkNotNullUserTest")
    }

    @Test
    fun checkNotSameUsersTest(){
        assertNotSame(bot, juan)
    }
    @Test
    fun checkSameUsersTest(){ // No son el mismo objeto
        val copyJuan = juan
        assertSame(copyJuan, juan)
    }
}