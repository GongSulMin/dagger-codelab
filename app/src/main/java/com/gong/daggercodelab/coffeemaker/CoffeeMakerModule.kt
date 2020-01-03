package com.gong.daggercodelab.coffeemaker

import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule  {

    @Provides
    fun provideHeater(): Heater {
        return A_HeaterImpl()
    }

    @Provides
    fun providePump(heater: Heater): Pump {
        return A_PumpImpl(heater)
    }

}