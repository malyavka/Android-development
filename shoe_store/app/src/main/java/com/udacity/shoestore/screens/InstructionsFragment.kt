package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsScreenBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding: FragmentInstructionsScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_instructions_screen,
            container,
            false
        )        //Inflate layout

        binding.instructionsButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }

        return binding.root
    }
}
