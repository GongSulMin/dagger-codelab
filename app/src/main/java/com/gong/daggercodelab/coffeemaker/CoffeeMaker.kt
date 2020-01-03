package com.gong.daggercodelab.coffeemaker

import javax.inject.Inject

class CoffeeMaker @Inject constructor(val heater: Heater , val pump: Pump){

    fun brew() {
        heater.on()
        pump.pump()
        println(" Coffee heater pump ON ON ON !!")
        heater.off()
    }

}