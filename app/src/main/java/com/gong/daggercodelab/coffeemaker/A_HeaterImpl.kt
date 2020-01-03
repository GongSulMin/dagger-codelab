package com.gong.daggercodelab.coffeemaker

class A_HeaterImpl: Heater {

    var heating: Boolean = false

    override fun on() {
        println("A_Heater : ~ ~ ~ heating ~ ~ ~")
        this.heating = true
    }

    override fun off() {
        this.heating = false
    }

    override fun isHot(): Boolean {
        return heating
    }

}