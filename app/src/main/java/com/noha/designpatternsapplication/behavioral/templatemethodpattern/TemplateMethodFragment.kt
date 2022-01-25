package com.noha.designpatternsapplication.behavioral.templatemethodpattern

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noha.designpatternsapplication.databinding.FragmentTemplateMethodBinding

class TemplateMethodFragment : Fragment() {

    private lateinit var binding: FragmentTemplateMethodBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTemplateMethodBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.alfredoButton.setOnClickListener {
            val penneAlfredo = PenneAlfredo()
            binding.textView.text = penneAlfredo.makeRecipe()
        }

        binding.spaghettiButton.setOnClickListener {
            val spaghettiMeatballs = SpaghettiMeatballs()
            binding.textView.text = spaghettiMeatballs.makeRecipe()
        }
    }
}