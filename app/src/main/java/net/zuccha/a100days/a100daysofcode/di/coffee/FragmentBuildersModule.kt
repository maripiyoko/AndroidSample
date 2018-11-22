package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.zuccha.a100days.a100daysofcode.ui.CoffeeMakerFragment
import net.zuccha.a100days.a100daysofcode.ui.HomeFragment

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeCoffeeMakerFragment(): CoffeeMakerFragment

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment
}