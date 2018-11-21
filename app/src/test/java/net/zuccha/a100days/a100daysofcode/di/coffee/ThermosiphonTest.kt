package net.zuccha.a100days.a100daysofcode.di.coffee

import com.nhaarman.mockitokotlin2.mock
import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class ThermosiphonTest {

    @Test
    fun pump() {
        val mockHeater: Heater = mock()
        val target = Thermosiphon(mockHeater)
        assertThat(target.pump(), `is`(false))
    }
}