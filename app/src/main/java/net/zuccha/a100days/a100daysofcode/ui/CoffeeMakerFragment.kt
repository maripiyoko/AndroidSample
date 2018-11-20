package net.zuccha.a100days.a100daysofcode.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.zuccha.a100days.a100daysofcode.databinding.CoffeeMakerFragmentBinding

class CoffeeMakerFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("DEBUG", "CoffeeMakerFragment")
        val binding = CoffeeMakerFragmentBinding.inflate(inflater, container, false)
        binding.message = "This is fragment!"
        return binding.root
    }
}
