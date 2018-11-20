package net.zuccha.a100days.a100daysofcode

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import net.zuccha.a100days.a100daysofcode.di.coffee.DaggerCoffeeShopComponent
import javax.inject.Inject

class CodeApplication: Application(), HasActivityInjector {
    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerCoffeeShopComponent.create().inject(this)
    }

    override fun activityInjector() = dispatchingAndroidInjector
}