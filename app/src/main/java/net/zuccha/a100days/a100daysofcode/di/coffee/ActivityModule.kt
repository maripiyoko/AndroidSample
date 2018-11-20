package net.zuccha.a100days.a100daysofcode.di.coffee

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.zuccha.a100days.a100daysofcode.MainActivity

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity
}