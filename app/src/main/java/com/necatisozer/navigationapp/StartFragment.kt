package com.necatisozer.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.necatisozer.navigationapp.databinding.FragmentStartBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class StartFragment : Fragment(R.layout.fragment_start) {
    private val binding by viewBinding(FragmentStartBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_riddleFragment)
        }
    }
}