package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Module
import dagger.Provides

@Module
class DripCoffeeModule {
    @Provides
    fun provideHeater(): Heater = ElectricHeater()

    @Provides
    fun providePump(pump: Thermosiphon): Pump = pump
}
