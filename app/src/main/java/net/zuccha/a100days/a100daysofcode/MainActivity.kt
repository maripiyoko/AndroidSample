package net.zuccha.a100days.a100daysofcode

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import net.zuccha.a100days.a100daysofcode.databinding.ActivityMainBinding
import net.zuccha.a100days.a100daysofcode.di.coffee.CoffeeMaker
import net.zuccha.a100days.a100daysofcode.di.coffee.CoffeeShopComponent
import net.zuccha.a100days.a100daysofcode.di.coffee.DaggerCoffeeShopComponent
import net.zuccha.a100days.a100daysofcode.samplemodels.A
import net.zuccha.a100days.a100daysofcode.samplemodels.DaggerSampleComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var maker: CoffeeMaker

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout

        // setup actionbar
        setSupportActionBar(binding.toolbar)

        val maker = DaggerSampleComponent.builder().build().maker()
        binding.message = maker.print()

        setupCoffeeMaker()
    }

    private fun setupCoffeeMaker() {
        Log.d("DEBUG", "start coffee maker")
        maker.brew()
    }
}
