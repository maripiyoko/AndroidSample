package net.zuccha.a100days.a100daysofcode.di.coffee

import android.util.Log
import net.zuccha.a100days.a100daysofcode.AllOpen
import javax.inject.Inject

@AllOpen
class Thermosiphon @Inject constructor(
    private val heater: Heater
) : Pump {
    override fun pump() =
        if (heater.isHot()) {
            Log.d("DEBUG", "pumping!!")
            true
        } else {
            false
        }
}