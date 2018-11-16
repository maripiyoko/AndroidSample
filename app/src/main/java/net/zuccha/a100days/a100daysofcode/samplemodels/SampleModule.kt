package net.zuccha.a100days.a100daysofcode.samplemodels

import dagger.Module
import dagger.Provides

@Module
class SampleModule {
    @Provides
    fun provideA(b: B) = A(b)

    @Provides
    fun provideB() = B()
}