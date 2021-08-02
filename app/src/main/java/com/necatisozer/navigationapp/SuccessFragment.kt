package com.necatisozer.navigationapp

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.necatisozer.navigationapp.databinding.FragmentSuccessBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class SuccessFragment : Fragment(R.layout.fragment_success) {
    private val binding by viewBinding(FragmentSuccessBinding::bind)
    private val args: SuccessFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewCorrectAnswer.text = args.correctAnswer
        binding.textViewCorrectAnswer.isVisible = args.correctAnswer.isNullOrBlank().not()

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_successFragment_to_startFragment)
        }
    }
}