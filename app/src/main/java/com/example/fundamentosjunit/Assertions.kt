package com.example.fundamentosjunit

class Assertions {
    private val user = User ("Juanes", 24)

    fun getluckyNumbres(): Array<Int>{
        return arrayOf(2, 117)
    }

    fun getName(): String{
        return user.name
    }

    fun checkHuman(user: User): Boolean{
        return user.isHuman
    }

    fun checkHuman(user: User? = null): Boolean?{
        if (user == null) return null
        return user.isHuman
    }

    fun isAdult(user: User): Boolean{
        if (!user.isHuman) return true

        return user.age >= 18
    }
}