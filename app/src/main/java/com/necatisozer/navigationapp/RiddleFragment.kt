package com.necatisozer.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.necatisozer.navigationapp.databinding.FragmentRiddleBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class RiddleFragment : Fragment(R.layout.fragment_riddle) {
    private val binding by viewBinding(FragmentRiddleBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonAnswer.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer() {
        val answer = binding.editTextAnswer.text.toString()

        when (answer.lowercase()) {
            "uçak" -> onSuccess()
            else -> onFail()
        }
    }

    private fun Fragment.onSuccess() {
        findNavController().navigate(R.id.action_riddleFragment_to_successFragment)
    }

    private fun onFail() {
        findNavController().navigate(R.id.action_riddleFragment_to_failFragment)
    }
}