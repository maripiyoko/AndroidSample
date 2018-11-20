package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.zuccha.a100days.a100daysofcode.ui.CoffeeMakerFragment

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeCoffeeMakerFragment(): CoffeeMakerFragment
}