package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Component

@Component(modules = [DripCoffeeModule::class])
interface CoffeeShopComponent {
    fun maker(): CoffeeMaker
}
