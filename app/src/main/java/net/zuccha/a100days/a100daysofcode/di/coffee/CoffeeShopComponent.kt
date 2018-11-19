package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Component
import net.zuccha.a100days.a100daysofcode.MainActivity

@Component(modules = [DripCoffeeModule::class])
interface CoffeeShopComponent {
    fun maker(): CoffeeMaker
    fun inject(activity: MainActivity)
}
