package com.gong.daggercodelab.coffeemaker

import dagger.Component

@Component(modules = [CoffeeMakerModule::class])
interface CoffeeComponent  {

    // provision Method
    fun make(): CoffeeMaker

    //member-injection method
    fun inject(coffeeMaker: CoffeeMaker)

}