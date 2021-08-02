package com.necatisozer.navigationapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
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

    private fun onSuccess() {
        val direction: NavDirections = RiddleFragmentDirections.actionRiddleFragmentToSuccessFragment("uçak")
        findNavController().navigate(direction)
    }

    private fun onFail() {
        val direction = RiddleFragmentDirections.actionRiddleFragmentToFailFragment()
        findNavController().navigate(direction)
    }
}