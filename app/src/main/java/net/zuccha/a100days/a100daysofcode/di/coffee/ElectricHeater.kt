package net.zuccha.a100days.a100daysofcode.di.coffee

import android.util.Log
import javax.inject.Inject

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