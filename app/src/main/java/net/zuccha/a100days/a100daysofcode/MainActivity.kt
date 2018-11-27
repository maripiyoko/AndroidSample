package net.zuccha.a100days.a100daysofcode

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import net.zuccha.a100days.a100daysofcode.databinding.ActivityMainBinding
import net.zuccha.a100days.a100daysofcode.di.coffee.CoffeeMaker
import net.zuccha.a100days.a100daysofcode.samplemodels.DaggerSampleComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {
    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    @Inject lateinit var maker: CoffeeMaker

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout

        navController = Navigation.findNavController(this, R.id.nav_content_fragment)

        // setup actionbar
        setSupportActionBar(binding.toolbar)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        val maker = DaggerSampleComponent.builder().build().maker()
        binding.message = maker.print()

        setupCoffeeMaker()
    }

    private fun setupCoffeeMaker() {
        Log.d("DEBUG", "start coffee maker")
        maker.brew()
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(drawerLayout, navController)
    }
    override fun supportFragmentInjector() = dispatchingAndroidInjector
}
