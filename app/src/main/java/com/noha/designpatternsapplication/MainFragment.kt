package com.noha.designpatternsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.noha.designpatternsapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.templateMethodButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_templateMethodFragment)
        }

        binding.observerButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_observerFragment)
        }

        return binding.root
    }
}