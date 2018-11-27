package net.zuccha.a100days.a100daysofcode.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.navOptions
import androidx.navigation.fragment.findNavController
import dagger.android.support.AndroidSupportInjection
import net.zuccha.a100days.a100daysofcode.R
import net.zuccha.a100days.a100daysofcode.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        view.findViewById<Button>(R.id.navigate_button_one)?.setOnClickListener {
            findNavController().navigate(R.id.coffeeMakerFragment, null, options)
        }

        view.findViewById<Button>(R.id.navigate_button_two)?.setOnClickListener {
            findNavController().navigate(R.id.lottieFragment)
        }
    }
}