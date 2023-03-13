package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentWelcomeScreenBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Inflate layout
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_welcome_screen,
            container,
            false
        )
        binding.welcomeButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }
        return binding.root
    }
}
