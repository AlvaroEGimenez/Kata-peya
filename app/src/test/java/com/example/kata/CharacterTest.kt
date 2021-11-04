package com.example.kata

import org.junit.Assert.*
import org.junit.Test

class CharacterTest {


    @Test
    fun `create character successfull alive`(){
        val characterTest = Character()
        val expected = Character(1000,1)
        assertEquals(expected,characterTest)
    }

    @Test
    fun `make damage`(){
        val characterTest = Character()
        val characterTarget = Character()
        characterTest.makeDamage(100,characterTarget)
        assertEquals(900,characterTarget.health)
    }

    @Test
    fun `make damege over 1000`(){
        val characterTest = Character()
        val characterTarget = Character()
        characterTest.makeDamage(1001,characterTarget)
        assertEquals(0,characterTarget.health)
    }

    @Test
    fun `make damage under 1000`(){
        val characterTest = Character()
        val characterTarget = Character()
        characterTest.makeDamage(999,characterTarget)
        assertEquals(1,characterTarget.health)
    }

    @Test
    fun `make damage over 1000, and is not alive`(){
        val characterTest = Character()
        val characterTarget = Character()
        characterTest.makeDamage(1001,characterTarget)
        assertFalse( characterTarget.isAlive())
    }

    @Test
    fun `make damage under 1000, and steel alive`(){
        val characterTest = Character()
        val characterTarget = Character()
        characterTest.makeDamage(999,characterTarget)
        assertTrue( characterTarget.isAlive())
    }

    @Test
    fun `heath character and verify not pass 1000`(){
        val characterTest = Character()
        val characterTarget = Character(100,1)
        characterTest.heal(1001, characterTarget)
        assertEquals(1000, characterTarget.health)
    }

    @Test
    fun `heath character`(){
        val characterTest = Character(500,10)
        characterTest.heal(255, characterTest)
        assertEquals(755, characterTest.health)
    }
}