package net.zuccha.a100days.a100daysofcode.samplemodels

import dagger.Component

@Component(modules = [SampleModule::class])
interface SampleComponent {
    fun maker(): A
}