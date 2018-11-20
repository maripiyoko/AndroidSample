package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Component
import net.zuccha.a100days.a100daysofcode.CodeApplication

@Component(modules = [
        DripCoffeeModule::class,
        ActivityModule::class
    ]
)
interface CoffeeShopComponent {
    fun maker(): CoffeeMaker
    fun inject(application: CodeApplication)
}
