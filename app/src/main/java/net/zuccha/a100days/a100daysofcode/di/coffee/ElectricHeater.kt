package net.zuccha.a100days.a100daysofcode.di.coffee

import android.util.Log
import net.zuccha.a100days.a100daysofcode.AllOpen
import javax.inject.Inject

@AllOpen
class ElectricHeater @Inject constructor(

): Heater {
    override fun isHot() = true
    override fun on() {
        Log.d("DEBUG :", "ElectricHeater.on")
    }

    override fun off() {
        Log.d("DEBUG :", "ElectricHeater.off")
    }
}