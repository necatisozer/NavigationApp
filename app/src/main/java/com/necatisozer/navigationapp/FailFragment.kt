package com.necatisozer.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.necatisozer.navigationapp.databinding.FragmentFailBinding
import com.necatisozer.navigationapp.databinding.FragmentRiddleBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class FailFragment : Fragment(R.layout.fragment_fail) {
    private val binding by viewBinding(FragmentFailBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_failFragment_to_startFragment)
        }
    }
}