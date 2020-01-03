package com.gong.daggercodelab.coffeemaker

class A_PumpImpl: Pump {

    private val heater: Heater

    constructor(heater: Heater) {
        this.heater = heater
    }

    override fun pump() {
        if (heater.isHot()) {
            println("A_Pump => => pumping => =>")
        }
    }
}