package net.zuccha.a100days.a100daysofcode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import net.zuccha.a100days.a100daysofcode.databinding.ActivityMainBinding
import net.zuccha.a100days.a100daysofcode.samplemodels.DaggerSampleComponent

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    private lateinit var message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout

        // setup actionbar
        setSupportActionBar(binding.toolbar)

        val maker = DaggerSampleComponent.builder().build().maker()
        binding.message = maker.print()
    }
}
