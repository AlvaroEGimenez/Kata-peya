package com.example.kata

data class Character(
    var health: Int = 1000,
    val level: Int = 1
){
    fun makeDamage(damage: Int, target: Character){
        target.health -= damage
        if (!target.isAlive()) {
            target.health = 0
        }
    }

    fun heal(health: Int, target: Character){
        if (target.isAlive())
        target.health = kotlin.math.min(1000,target.health + health)
    }

}