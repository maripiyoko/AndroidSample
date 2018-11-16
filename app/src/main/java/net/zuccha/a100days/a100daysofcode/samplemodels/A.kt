package net.zuccha.a100days.a100daysofcode.samplemodels

import android.util.Log
import javax.inject.Inject

class A @Inject constructor(
    private val b: B
)  {
    fun print() = "A is using $b"
}