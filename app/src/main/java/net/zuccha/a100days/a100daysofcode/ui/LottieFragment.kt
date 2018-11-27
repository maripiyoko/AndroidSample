package net.zuccha.a100days.a100daysofcode.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import net.zuccha.a100days.a100daysofcode.databinding.LottieFragmentBinding

class LottieFragment : Fragment() {
    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = LottieFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
