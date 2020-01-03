package com.gong.daggercodelab.coffeemaker

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}