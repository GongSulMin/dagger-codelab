package com.gong.daggercodelab.coffeemaker

import javax.inject.Inject

class A_PumpImpl: Pump {

    private val heater: Heater

    @Inject constructor(heater: Heater) {
        this.heater = heater
    }

    override fun pump() {
        if (heater.isHot()) {
            println("A_Pump => => pumping => =>")
        }
    }
}