package net.zuccha.a100days.a100daysofcode.di.coffee

import javax.inject.Inject

class CoffeeMaker @Inject constructor(
    private val heater: Heater,
    private val pump: Pump
) {
    fun message() = "injected coffee maker!"

    fun brew() {
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}